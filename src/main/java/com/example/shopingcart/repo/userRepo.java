package com.example.shopingcart.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.shopingcart.module.userInfo;
import org.springframework.stereotype.Repository;


@Repository
public interface userRepo extends JpaRepository<userInfo,Integer> {
}
