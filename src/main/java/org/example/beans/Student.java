package org.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Student {



    @PostConstruct
    private  void init(){
        this.name ="MOHAMED DHAMEN";
    }
    private String name ;

    public Student() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }
}
