package org.example.services;

import org.example.config.ProjectConfig;
import org.example.config.golbalConfig.GlobalConfigApp;
import org.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
   private  ProductRepository repository;


    public ProductRepository getRepository() {
        return repository;
    }

    public void setRepository(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductService( ) {
    }

    public void add() {
        System.out.println(" adding product from service  "+repository.getUserName()+" "
                +repository.getDataBaseUrl()
                +" "
                +repository.getUserPassword());
       repository.add();
    }

}