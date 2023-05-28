package org.example.config;

import org.example.beans.Employee;
import org.example.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
@ComponentScan(basePackages = {"org.example.beans","org.example.services","org.example.repository"})
public class ProjectConfig {

//    @Bean("student1")
//    public Student getstudent(){
//        Student student =new Student();
//        student.setName("MOHAMED");
//
//        return student;
//    }
//    @Bean("student2")
//    public Student getstudent2(){
//        Student student =new Student();
//        student.setName("Ayoub");
//
//        return student;
//    }


    @Bean("employee1")
    public Employee getEmployee(){

        Employee employee=new Employee("MOHAMED DHAMEN","1332GK");

        return employee;
    }
    @Bean("employee2")
    public Employee getEmployee2(){

        Employee employee=new Employee("AYOUB DHAMEN","1332FL");

        return employee;
    }

    @Bean("toMysqlConnection")
    public ProductRepository getProductRepository(){
            ProductRepository productRepository=new ProductRepository();
            productRepository.setDataBaseUrl("Https//localhos:3560/test");
            productRepository.setUserName("MOHAMED");
            productRepository.setUserPassword("12345662");
        return  productRepository;
    }

    @Bean
    public DataSource getDataSourc(){

        var datasource=new DriverManagerDataSource();
            datasource.setUrl("");
            datasource.setUsername("");
            datasource.setPassword("");

            return datasource;
    }
    @Bean("MysqlJdbcConnection")
    public JdbcTemplate getjdbcTemplate(){
        return  new JdbcTemplate(getDataSourc());
    }

}
