package org.example;

import org.example.config.golbalConfig.GlobalConfigApp;
import org.example.repository.ProductRepository;
import org.example.services.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = GlobalConfigApp.getContext();
        ProductService productService =(ProductService) context.getBean(ProductService.class);
        ProductRepository productRepository=(ProductRepository)context.getBean("toMysqlConnection");
        productService.setRepository(productRepository);
        productService.add();
    }
}
