package com.example.shopingcart.repo;

import com.example.shopingcart.module.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface adminProductRepo extends JpaRepository<product, Integer> {
}
