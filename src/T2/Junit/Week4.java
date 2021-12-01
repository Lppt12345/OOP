public class Week4 {
    /**
     * So sanh 2 so.
     *
     * @param a so 1.
     * @param b so 2.
     * @return max of $a and $b.
     */
    public static int max2Int(int a, int b) {
        if (a >= b) {
            return a;
        } else return b;
    }

    /**
     * Tim min trong day
     *
     * @param arr Tham so/
     * @return min cua day.
     */
    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int A : arr) {
            if (A < min) {
                min = A;
            }
        }
        return min;
    }

    /**
     * Tinh toan BMI.
     *
     * @param weight can nang.
     * @param height chieu cao.
     * @return BMI.
     */
    public static String calculateBMI(double weight, double height) {

        double BMI = weight / (height * height);
        BMI = Math.round(BMI * 10.0) / 10.0;
        if (BMI < 18.5) {
            return "Thiếu cân";
        } else if (BMI >= 18.5 && BMI <= 22.9) {
            return "Bình thường";
        } else if (BMI >= 23 && BMI <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
