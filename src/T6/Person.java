public class Person {
    private final String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * In string.
     *
     * @return string.
     */
    public String toString() {
        String result = "";
        result = "Person[name=" + this.name + ",address=" + this.address + "]";
        return result;
    }

}
