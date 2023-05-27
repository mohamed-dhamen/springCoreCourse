package org.example.beans;

public class Employee {
    private String name ;
    private String matricule ;

    public Employee(String name, String matricule) {
        this.name = name;
        this.matricule = matricule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", matricule='" + matricule + '\'' +
                '}';
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Employee() {
    }
}
