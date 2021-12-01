//import java.util.Scanner;
//
//public class StudentManagement {
//
//    public Student[] students = new Student[100];
//
//    public int number = 0;
//
//    /**
//     * Kiem tra co cung group kh.
//     *
//     * @param s1 student 1.
//     * @param s2 student 2.
//     * @return dung or sai.
//     */
//    public static boolean sameGroup(Student s1, Student s2) {
//        return s1.getGroup().equals(s2.getGroup());
//    }
//
//    /**
//     * Ham them sinh vien.
//     *
//     * @param newStudent sinh vien moi.
//     */
//    public void addStudent(Student newStudent) {
//        students[number] = newStudent;
//        number++;
//    }
//
//    /**
//     * Ham viet sinh vien theo list.
//     *
//     * @return Tra ve danh sach sinh vien theo list.
//     */
//    public String studentsByGroup() {
//        String kq = "";
//        boolean[] check = new boolean[number];
//        for (int i = 0; i < number; i++) {
//            check[i] = false;
//        }
//        for (int i = 0; i < number; i++) {
//            if (check[i] == false) {
//                kq += students[i].getGroup() + "\n";
//                String kt = students[i].getGroup();
//                for (int j = i; j < number; j++) {
//                    if (students[j].getGroup().equals(kt)) {
//                        check[j] = true;
//                        kq += students[j].getInfo() + "\n";
//                    }
//                }
//            }
//        }
//        return kq;
//    }
//
//    /**
//     * Ham xoa sinh vien.
//     *
//     * @param id MSV.
//     */
//    public void removeStudent(String id) {
//        for (int i = 0; i < number; i++) {
//            if (students[i].getId().equals(id)) {
//                for (int j = i; j < number - 1; j++) {
//                    students[j] = students[j + 1];
//                }
//                number--;
//                break;
//            }
//
//        }
//    }
//
//    /**
//     * Test.
//     * @param args bien co dinh.
//     */
//    public static void main(String[] args) {
//        Student S = null;
//        Student s1 = new Student(S);
//
////        Scanner scanner = new Scanner(System.in);
////        StudentManagement manager = new StudentManagement();
////        Student student = new Student();
////        student.setName("Nguyen Van Binh");
////        student.setId("19021263");
////        student.setGroup("K62CC");
////        student.setEmail("19021260@vnu.edu.vn");
////
////        System.out.println(student.getInfo());
////        for (int i = 0; i < 3; i++) {
////            String name = scanner.nextLine();
////            String id = scanner.nextLine();
////            String email = scanner.nextLine();
////            Student studentA = new Student(name, id, email);
////            manager.addStudent(studentA);
////        }
////        System.out.println(manager.studentsByGroup());
//    }
//}
