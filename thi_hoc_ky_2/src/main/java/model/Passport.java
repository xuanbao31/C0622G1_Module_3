package model;

public class Passport {
    private int id;
    private String name;
    private String age;
    private String address;
    private String city;
    private String nickName;

    public Passport(int id, String name, String age, String address, String city, String nickName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.city = city;
        this.nickName = nickName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
