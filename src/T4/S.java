import java.util.Scanner;

public class S {
    /**
     * Check.
     *
     * @param n so n.
     * @return kieu booolen.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    /**
     * Main.
     *
     * @param args tham so.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}