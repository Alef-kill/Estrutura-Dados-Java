/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package students;

/**
 *
 * @author Olafi
 */
public class Student {
    int enroll;
    String name;
    int age;
    String address;

    public Student(int enroll, String name, int age, String address) {
        this.enroll = enroll;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getEnroll() {
        return enroll;
    }

    public void setEnroll(int enroll) {
        this.enroll = enroll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Students{" + "enroll=" + enroll + ", name=" + name + ", age=" + age + ", address=" + address + '}';
    }
}
