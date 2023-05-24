package org.example;

import java.util.Map;

public class Student {
    public String name;

    public Student(Map<String, Module> moduls) {
        this.moduls = moduls;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", moduls=" + moduls +
                ", address=" + address +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Map<String, Module> getModuls() {
        return moduls;
    }

    public void setModuls(Map<String, Module> moduls) {
        this.moduls = moduls;
    }

    public Student(String name, Map<String, Module> moduls, Address address, String lastName) {
        this.name = name;
        this.moduls = moduls;
        this.address = address;
        this.lastName = lastName;
    }

    public Map<String,Module> moduls;

    public Student(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(String name, Address address, String lastName) {
        this.name = name;
        this.address = address;
        this.lastName = lastName;
    }

   public  Address address ;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Student() {
    }

    public String lastName;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
