import java.util.Scanner;

/**
 * UCLN.
 */
public class UCLN {
    /**
     * UCLN.
     *
     * @param a so 1.
     * @param b so 2.
     * @return UCLN.
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * Ham main.
     *
     * @param args dau vao.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }
}