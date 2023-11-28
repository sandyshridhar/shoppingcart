package com.example.shopingcart.module;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String p_name;
    String p_price;
    String p_qty;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setP_qty(String p_qty) {
        this.p_qty = p_qty;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public void setP_price(String p_price) {
        this.p_price = p_price;
    }

    public String getP_name() {
        return p_name;
    }

    public String getP_price() {
        return p_price;
    }

    public String getP_qty() {
        return p_qty;
    }
}
