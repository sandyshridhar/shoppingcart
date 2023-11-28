package com.example.shopingcart.controller;

import com.example.shopingcart.module.product;
import com.example.shopingcart.service.adminProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class adminProductController {

    @Autowired
    adminProductService adminProductService;

    @RequestMapping("/admin")
    public String main(Model model)
    {
        System.out.println("admin Index.");
        List<product> productlist=adminProductService.getAllProduct();
        System.out.println(productlist);
        model.addAttribute("allproduct",productlist);
        return "adminIndex.html";
    }
    @RequestMapping("/addproduct")
    public  String addProduct(Model model)
    {
        System.out.println("admin addProduct.");
        model.addAttribute("product",new product());
        return "adminAddProduct.html";
    }
    @RequestMapping("/saveproduct")
    public String saveOrUpdateProduct(product product, Model model)
    {
        product p=adminProductService.saveOrUpdateProduct(product);
        System.out.println("saved"+p.toString());
        return "redirect:/addproduct";
    }
    @RequestMapping("/editproduct/{id}")
    public String editProduct(@PathVariable int id,Model model)
    {
        System.out.println(id);
        product product=adminProductService.editProduct(id);
        model.addAttribute("product",product);
        return "adminAddProduct";
    }
    @RequestMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable int id, Model model)
    {
        System.out.println(id);
        adminProductService.deleteProduct(id);
        return "redirect:/admin";
    }
}
