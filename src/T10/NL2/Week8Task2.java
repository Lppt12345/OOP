package T10.NL2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {
    public static void nullPointerEx() throws NullPointerException {
        String test = null;
        test.toCharArray();
    }

    /**
     * h.
     *
     * @return l.
     */
    public String nullPointerExTest() {
        String result = "Không có lỗi";
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            result = "Lỗi Null Pointer";
        }
        return result;
    }

    /**
     * H.
     *
     * @throws ArrayIndexOutOfBoundsException nl.
     */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        double[] a = new double[5];
        a[19] = 9;
    }

    /**
     * H.
     *
     * @return l.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    public void arithmeticEx() throws ArithmeticException {
        float a = 11 / 0;
    }

    /**
     * H.
     *
     * @return l.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    public void fileNotFoundEx() throws FileNotFoundException {
        FileReader fr = new FileReader("faaknfafagaweed");
    }

    /**
     * H.
     *
     * @return l.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    public void ioEx() throws IOException {
        FileReader fr = new FileReader("sssssssssww");
    }

    /**
     * H.
     *
     * @return l.
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}
