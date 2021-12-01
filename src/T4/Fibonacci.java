//import your library

import java.util.Scanner;

/**
 * Bai tap fibonaci.
 */
public class Fibonacci {

    /**
     * Ham fibonaci.
     *
     * @param n so dua vao.
     * @return Fibonaci.
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        if (n > Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }
        long check = 1;
        long soD = 0;
        long soH = 1;
        long luu;
        while (check != n) {
            luu = soH;
            soH = soD + soH;
            soD = luu;
            check++;
        }
        if (soH < 0) {
            return Long.MAX_VALUE;
        }
        return (long) soH;

    }

    /**
     * Ham main.
     *
     * @param args dau vao.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(fibonacci(number));
    }
}