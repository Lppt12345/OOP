/**
 * Class Solution.
 */
public class Solution {
    private int numerator;
    private int denominator;

    /**
     * khai bao mac dinh.
     */
    public Solution() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Solution(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    /**
     * ham khoi tao.
     *
     * @param numerator   tu so.
     * @param denominator mau so.
     */
    public Solution(int numerator, int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
        this.numerator = numerator;
    }

    /**
     * Ham set tu so.
     *
     * @param numerator tu so.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Ham set mau so.
     *
     * @param denominator mau so
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }

    /**
     * Ham get mau so.
     *
     * @return mau so.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Ham get tu so.
     *
     * @return tu so.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Tim  UCLN.
     *
     * @param a so 1.
     * @param b so 2.
     * @return UCLN.
     */
    public int gcd(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * Ham rut gon.
     */
    public Solution reduce() {
        int ucln = gcd(this.denominator, this.numerator);
        int b = this.denominator / ucln;
        int a = this.numerator / ucln;
        this.numerator = a;
        this.denominator = b;
        return this;
    }

    /**
     * Cong ps.
     *
     * @param other Pso khac.
     * @return tong.
     */
    public Solution add(Solution other) {
        if (other.denominator != 0) {
            Solution fr = new Solution();
            int a = this.numerator * other.denominator + other.numerator * this.denominator;
            int b = this.denominator * other.denominator;
            fr.numerator = a;
            fr.denominator = b;
            return fr;
        }
        return this;
    }

    /**
     * Tru ps.
     *
     * @param other Pso khac.
     * @return hieu.
     */
    public Solution subtract(Solution other) {
        if (other.denominator != 0) {
            Solution fr = new Solution();
            int a = this.numerator * other.denominator - other.numerator * this.denominator;
            int b = this.denominator * other.denominator;
            fr.numerator = a;
            fr.denominator = b;
            return fr;
        }
        return this;
    }

    /**
     * Nhan.
     *
     * @param other Pso khac
     * @return kqua phep nhan
     */
    public Solution multiply(Solution other) {
        if (other.denominator != 0) {
            Solution fr = new Solution();
            int a = this.numerator * other.numerator;
            int b = this.denominator * other.denominator;
            fr.numerator = a;
            fr.denominator = b;
            return fr;
        }
        return this;
    }

    /**
     * Chia.
     *
     * @param other Phan so khac.
     * @return Kqua phep chia.
     */
    public Solution divide(Solution other) {
        if (other.denominator != 0) {
            Solution fr = new Solution();
            int a = this.numerator * other.denominator;
            int b = this.denominator * other.numerator;
            fr.numerator = a;
            fr.denominator = b;
            return fr;
        }
        return this;
    }

    /**
     * So sanh 2 phan so.
     *
     * @param obj tham so doi tuong.
     * @return true or false ?.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            if (other.denominator == 0) {
                return false;
            }
            other.reduce();
            this.reduce();
            if (this.numerator == other.numerator && this.denominator == other.denominator) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}