package T14.DesignPattern.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String birthOfDate;
    private String sex;
    private String married;
    private List<Person> children;

    public Person(String name, String birthOfDate, String sex, String married) {
        this.name = name;
        this.birthOfDate = birthOfDate;
        this.sex = sex;
        this.married = married;
        this.children = new ArrayList<>();
    }

    public String toString() {
        return "[ Name: " + name + ", Date of birth: " + birthOfDate + ", Sex: " + sex + " ]";
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public String getName() {
        return name;
    }

    public String getBirthOfDate() {
        return birthOfDate;
    }

    public String getSex() {
        return sex;
    }

    public String getMarried() {
        return married;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthOfDate(String birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

}