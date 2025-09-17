
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mayco
 */
public class Person {
    private String name  = "";
    private String address = "";
    private String id = "";
    private  String phone = "";

    public Person(String name, String last_name,  String id,  int age,  String phone) {
        this.name = name;
        this.address = last_name;
        this.id = id;
       this.phone = phone;
    }

    public Person() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }


    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + getName() + ", last_name=" + getAddress() + ", id=" + getId() + ", phone=" + getPhone() + '}';
    }


     
}
