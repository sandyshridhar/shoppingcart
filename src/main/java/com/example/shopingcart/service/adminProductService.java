package com.example.shopingcart.service;

import com.example.shopingcart.module.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.shopingcart.repo.adminProductRepo;

import java.util.List;


@Service
public class adminProductService {

    @Autowired
    adminProductRepo adminProductRepo;

    public List<product> getAllProduct() {
        return adminProductRepo.findAll();
    }

    public product saveOrUpdateProduct(product product) {
        if(product.getId() == 0)
        {
            adminProductRepo.save(product);
            return product;
        }else {
            product p1=adminProductRepo.getById(product.getId());
            p1.setP_name(product.getP_name());
            p1.setP_price(product.getP_price());
            p1.setP_qty(product.getP_qty());
            return adminProductRepo.save(p1);
        }
    }

    public product editProduct(int id) {
        return adminProductRepo.getById(id);
    }

    public void deleteProduct(int id) {
        adminProductRepo.deleteById(id);
    }
}
