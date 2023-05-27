package org.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private String dataBaseUrl="https//localhost:8080/mydatabase";
    private String userName="DHAMEN";
    private String userPassword="123";

    public String getDataBaseUrl() {
        return dataBaseUrl;
    }

    public void setDataBaseUrl(String dataBaseUrl) {
        this.dataBaseUrl = dataBaseUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public ProductRepository() {
    }

    public ProductRepository(String dataBaseUrl, String userName) {
        this.dataBaseUrl = dataBaseUrl;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "ProductRepository{" +
                "dataBaseUrl='" + dataBaseUrl + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }

    public void add(){

        System.out.println(" adding product from repository ");
    }
}
