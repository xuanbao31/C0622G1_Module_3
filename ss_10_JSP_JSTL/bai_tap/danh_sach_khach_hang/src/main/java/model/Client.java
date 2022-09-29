package model;

public class Client {
    String name;
    String birth;
    String address;
    String picture;

    public Client(String name, String birth, String address, String picture) {
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.picture = picture;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
