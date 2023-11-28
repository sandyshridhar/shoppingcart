package com.example.shopingcart.service;

import com.example.shopingcart.module.product;
import com.example.shopingcart.module.userInfo;
import com.example.shopingcart.repo.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.shopingcart.repo.adminProductRepo;

import java.util.List;


@Service
public class productService {
    @Autowired
    adminProductRepo adminProductRepo;
    @Autowired
    userRepo userRepo;
    public List<product> getAllProduct() {
        return adminProductRepo.findAll();
    }

    public product getProduct(int id) {
        return adminProductRepo.getById(id);
    }

    public userInfo saveItem(userInfo user) {
        return userRepo.save(user);
    }
}
