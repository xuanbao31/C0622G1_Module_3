package model;

public class Dreamer {
    private  int id;
    private String name;
    private String age;
    private String country;
    private String address;

    public Dreamer() {
    }

    public Dreamer(int id, String name, String age, String country, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
