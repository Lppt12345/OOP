public class Student {

    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getId() {
        return id;
    }

    public void setId(String n) {
        id = n;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String n) {
        group = n;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String n) {
        email = n;
    }

    /**
     * Dien thong tin sinh vien.
     *
     * @param name  ten.
     * @param id    MSV.
     * @param email gmail.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * Khai bao mac dinh.
     */
    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Ham khai bao.
     *
     * @param s Sinh vien.
     */
    public Student(Student s) {
        name = s.name;
        id = s.id;
        email = s.email;
        group = "K62CB";
    }

    /**
     * In.
     *
     * @return in ra.
     */
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }


}
