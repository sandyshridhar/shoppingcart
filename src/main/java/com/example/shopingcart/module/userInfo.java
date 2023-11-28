package com.example.shopingcart.module;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data

public class userInfo {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    int id;
     String fname;
     String lname;
     String email;
     String number;
     String state;
     String city;
     String pincode;
//     @OneToMany(cascade = CascadeType.ALL,mappedBy = "userInfo")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fuser_id")
     List<orderProduct> orderProduct;


    public userInfo() {
    }

    public userInfo( String fname, String lname, String email, String number, String state, String city, String pincode) {

        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.number = number;
        this.state = state;
        this.city = city;
        this.pincode = pincode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
