package org.example;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Resource resource=new ClassPathResource("applicationContext.xml");
        //BeanFactory factory=new XmlBeanFactory(resource);

        //Student student=(Student)factory.getBean("studentbean");
//
//        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student student= (Student) context.getBean("studentbean");
//        student.displayInfo();

        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            Student student = (Student) context.getBean("student2é");
            student.displayInfo();

        }



  }


}
