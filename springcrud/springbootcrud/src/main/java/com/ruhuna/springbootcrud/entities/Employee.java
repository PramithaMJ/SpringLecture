package com.ruhuna.springbootcrud.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // This is not necessary if the column name is the same as the variable name
    private int id;
    @Column(name = "first_name") // This is not necessary if the column name is the same as the variable name
    private String firstName;
    @Column(name = "last_name") // This is not necessary if the column name is the same as the variable name;
    private String lastName;
    @Column(name = "email") // This is not necessary if the column name is the same as the variable name
    private String email;

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
