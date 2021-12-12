package T14.InputOutput;

import java.io.*;

public class Utils {
    private static  String result = "";
    public static String readContentFromFile(String path) throws IOException {
        StringBuilder result = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine()) != null) {
            result.append(line);
        }
        br.close();
        return result.toString();
    }

    public static void writeContentToFileB(String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write(result);
        buffer.close();
    }

    public static void writeContentToFileC(String path) throws IOException {
        FileWriter out = new FileWriter(path, true);
        out.write(result);
        out.close();
    }

    public static File findFileByName(String folderPath, String fileName) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.getName().equals(fileName)) return file;
            }
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        File input = findFileByName("E:\\ACode\\OASIS\\src\\T14\\InputOutput", "input.txt");
        if (input != null) {
            result = readContentFromFile(input.getAbsolutePath());
            System.out.println("DOC DUOC FILE NOI DUNG LA: " + result);
        }
        File output = findFileByName("E:\\ACode\\OASIS\\src\\T14\\InputOutput", "output.txt");
        if (output != null){
            // them xau vao txt
            writeContentToFileB(output.getAbsolutePath());
            result = " sau khi them vao cuoi xau";
            writeContentToFileC(output.getAbsolutePath());
        }
    }
}