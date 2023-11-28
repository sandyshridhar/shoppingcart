package com.example.shopingcart.module;

import lombok.*;


import javax.persistence.*;

@Entity
@Data

public class orderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String p_name;
    String p_qty;
    String p_price;

//    @ManyToOne(fetch = FetchType.LAZY,optional = false)
//    @JoinColumn(name = "user_id",nullable = false)
    @ManyToOne
    userInfo userInfo;

    public orderProduct( String p_name, String p_qty, String p_price) {
        this.p_name = p_name;
        this.p_qty = p_qty;
        this.p_price = p_price;
    }

    public orderProduct() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_qty() {
        return p_qty;
    }

    public void setP_qty(String p_qty) {
        this.p_qty = p_qty;
    }

    public String getP_price() {
        return p_price;
    }

    public void setP_price(String p_price) {
        this.p_price = p_price;
    }

    public com.example.shopingcart.module.userInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(com.example.shopingcart.module.userInfo userInfo) {
        this.userInfo = userInfo;
    }
}
