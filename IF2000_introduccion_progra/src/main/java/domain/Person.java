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
    private String last_name = "";
    private int id = 0;
    private  int age = 0;
    private  int phone = 0;

    public Person(String name, String last_name,  int id,  int age,  int phone) {
        this.name = name;
        this.last_name = last_name;
        this.id = id;
        this.age = age;
       this.phone = phone;
    }

    public Person() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + getName() + ", last_name=" + getLast_name() + ", id=" + getId() + ", age=" + getAge() + ", phone=" + getPhone() + '}';
    }


     
}
