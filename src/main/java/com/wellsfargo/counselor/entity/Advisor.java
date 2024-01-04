package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Advisor {

    @Id
    @GeneratedValue
    @JsonIgnore
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    // Default constructor for JPA
    protected Advisor() {

    }

    // Constructor initializing all instance variables
    @JsonIgnore
    public Advisor(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // Getter and setter methods
    @JsonIgnore
    public long getAdvisorId() {
        return advisorId;
    }

    @JsonIgnore
    public String getFirstName() {
        return firstName;
    }

    @JsonIgnore
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonIgnore
    public String getLastName() {
        return lastName;
    }

    @JsonIgnore
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonIgnore
    public String getAddress() {
        return address;
    }

    @JsonIgnore
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonIgnore
    public String getPhone() {
        return phone;
    }

    @JsonIgnore
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonIgnore
    public String getEmail() {
        return email;
    }

    @JsonIgnore
    public void setEmail(String email) {
        this.email = email;
    }
}

