public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Khai bao.
     *
     * @param name    ten.
     * @param address dia chi.
     * @param school  truong.
     * @param pay     gia.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * In string.
     *
     * @return String.
     */
    public String toString() {
        String re = super.toString();
        re = "Staff[" + re + ",school=" + this.school + ",pay=" + this.pay + "]";
        return re;
    }
}
