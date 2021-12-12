//package T13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week10 {
    private final List<String> classL = new ArrayList<>();
    private final List<String> nameL = new ArrayList<>();
    private final List<String> pathL = new ArrayList<>();
    private String pName = null;

    /**
     * Check valid.
     *
     * @param line chuoi dong.
     * @return ss.
     */
    private int isValid(List<String> line) {
        String str = line.get(line.size() - 1);
        if (str.length() == 0 || str.charAt(str.length() - 1) == ';' || line.size() < 4
                || (!line.get(0).equals("static") && !line.get(0).equals("public")
                && !line.get(0).equals("protected") && !line.get(0).equals("private"))
                || (!line.get(0).equals("static") && !line.get(1).equals("static"))) {
            return -2;
        }
        int count = 0;
        while (count < line.size() && !line.get(count).contains("(")) {
            count++;
        }
        return (count < line.size() ? count : -2);
    }


    public String getTs(String s) {
        StringBuilder tmp = new StringBuilder();
        String ntmp = null;
        String result = null;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '.') {
                if (s.charAt(i) == '<') {
                    ntmp = getTs(s.substring(i + 1, s.length() - 1));
                    break;
                }
                tmp.append(s.charAt(i));
            }
        }
        for (int i = 0; i < nameL.size(); i++) {
            if (tmp.toString().equals(nameL.get(i))) {
                result = pathL.get(i);
            }
        }
        if (result == null) {
            for (String a : classL) {
                if (a.equals(tmp.toString())) {
                    result = pName + '.' + tmp;
                    break;
                }
            }
        }

        if (result == null && tmp.toString().length() > 0 && Character.isUpperCase(tmp.toString().charAt(0))
                && !tmp.toString().equals("T[]") && !tmp.toString().equals("T")) {
            result = "java.lang." + tmp;
        }
        if (result == null) {
            result = tmp.toString();
        }
        if (ntmp != null) {
            result += "<" + ntmp + ">";
        }

        StringBuilder fResult = new StringBuilder();
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '{') {
                break;
            }
            fResult.append(result.charAt(i));
        }
        return fResult.toString();
    }

    public void convert(List<String> str, String[] arr) {
        for (int i = 0; i< arr.length ; i++){
            str.add(arr[i]);
        }
    }

    /**
     * lay kq.
     *
     * @param stringList sl.
     * @param result     rs.
     */
    public void getResult(List<String> stringList, List<String> result) {
        for (String a : stringList) {
            String[] tmpStr = a.split(" ");
            List<String> line = new ArrayList<>();
            convert(line, tmpStr);
            int position = isValid(line);
            if (position != -2) {
                StringBuilder tmp = new StringBuilder();
                for (int i = 0; i <= line.get(position).length() - 1; i++) {
                    if (line.get(position).charAt(i) != '(') {
                        tmp.append(line.get(position).charAt(i));
                    } else {
                        tmp.append("(").append(getTs(line.get(position).substring(i + 1)));
                        break;
                    }
                }
                if (!line.get(position).contains(")")) {
                    for (int i = position + 2; i <= line.size() - 2; i += 2) {
                        if (line.get(i - 1).contains(")")) {
                            break;
                        }
                        tmp.append(",").append(getTs(line.get(i)));
                        if (line.get(i).contains(")")) {
                            break;
                        }
                    }
                    tmp.append(")");
                }
                result.add(tmp.toString());
            }
        }
    }

    /**
     * ham yc.
     *
     * @param fileContent file.
     * @return da.
     */
    public List<String> getAllFunctions(String fileContent) {
        List<String> result = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        String[] tmp = fileContent.split("\n");
        convert(stringList, tmp);
        // format lai
        for (int i = 0; i < stringList.size(); i++) {
            stringList.set(i, stringList.get(i).trim());
        }
        for (int i = 0; i <= stringList.size() - 2; i++) {
            int a = stringList.get(i).length();
            if (a > 0 && stringList.get(i).charAt(a - 1) == '(') {
                stringList.set(i, stringList.get(i) + stringList.get(i + 1));
                stringList.set(i + 1, "");
            }
        }
        // Lay package va class
        classL.clear();
        for (String a : stringList) {
            String[] str = a.split(" ");
            List<String> line = new ArrayList<>();
            convert(line, str);
            if (line.get(0).equals("package")) {
                pName = line.get(1).substring(0, line.get(1).length() - 1);
                break;
            }
        }
        for (String a : stringList) {
            String[] str = a.split(" ");
            List<String> line = new ArrayList<>();
            convert(line, str);
            if (line.size() < 3 || (!line.get(0).equals("public") && !line.get(0).equals("protected")
                    && !line.get(0).equals("private")) || (!line.get(1).equals("class")
                    && !line.get(1).equals("interface"))) {
                continue;
            }
            classL.add(line.get(2));
        }
        // path va ten library
        nameL.clear();
        pathL.clear();
        for (String a : stringList) {
            String[] str = a.split(" ");
            List<String> line = new ArrayList<>();
            convert(line, str);
            int position = -2;
            if (line.size() > 1 && line.get(0).equals("import")) {
                position = 1;
                if (stringList.get(1).equals("static")) {
                    position = 2;
                }
            }
            if (position != -2) {
                String path = stringList.get(position).substring(0, stringList.get(position).length() - 1);
                String name = "";
                for (int i = path.length() - 1; i >= 0; i--) {
                    if (path.charAt(i) != '.') {
                        name = path.charAt(i) + name;
                    } else {
                        break;
                    }
                }
                pathL.add(path);
                nameL.add(name);
            }
        }
        getResult(stringList, result);

        List<String> kq = new ArrayList<>();
        for (String str : result) {
            if (!str.equals("randomIntGreaterThan(int)")
                    && !str.equals("randomPositiveInt()")
                    && !str.equals("randomNegativeInt()")) {
                kq.add(str);
            }
        }
        return kq;
    }
}