package org.example.config;

import org.example.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean("student1")
    public Student getstudent(){
        Student student =new Student();
        student.setName("MOHAMED");

        return student;
    }
    @Bean("student2")
    public Student getstudent2(){
        Student student =new Student();
        student.setName("Ayoub");

        return student;
    }

}
