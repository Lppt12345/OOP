//public class Student extends Person {
//    private String program;
//    private int year;
//    private double fee;
//
//    /**
//     * Khai bao.
//     *
//     * @param name    ten.
//     * @param address dia chi.
//     * @param program chuong trinh.
//     * @param year    nam.
//     * @param fee     phi.
//     */
//    public Student(String name, String address, String program, int year, double fee) {
//        super(name, address);
//        this.year = year;
//        this.program = program;
//        this.fee = fee;
//    }
//
//    public String getProgram() {
//        return program;
//    }
//
//    public void setProgram(String program) {
//        this.program = program;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public double getFee() {
//        return fee;
//    }
//
//    public void setFee(double fee) {
//        this.fee = fee;
//    }
//
//    /**
//     * In string.
//     *
//     * @return String.
//     */
//
//    public String toString() {
//        String re = super.toString();
//        re = "Student[" + re + ",program=" + this.program + ",year="
//                + this.year + ",fee=" + this.fee + "]";
//        return re;
//    }
//
//}
