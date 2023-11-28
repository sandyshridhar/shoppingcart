package com.example.shopingcart.controller;

import com.example.shopingcart.module.product;
import com.example.shopingcart.module.userInfo;
import com.example.shopingcart.module.orderProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.shopingcart.service.productService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class productController {

    @Autowired
    productService productService;
    @RequestMapping("/")
    public String Main(Model model)
    {
        List<product> product=productService.getAllProduct();
        model.addAttribute("allproduct",product);
        return "index.html";
    }
    @RequestMapping("/addtocart/{id}")
    public String addToCart(@PathVariable int id, HttpServletRequest request,Model model)
    {
        product p1= productService.getProduct(id);
        List<product> products= (List<product>) request.getSession().getAttribute("cartproduct");
        if(products==null)
        {
            products=new ArrayList<>();
            request.getSession().setAttribute("cartproduct",products);
        }
        products.add(p1);
        request.getSession().setAttribute("cartproduct",products);
        System.out.println(products);
        model.addAttribute("cartproduct",products);
        return "addtocart.html";
    }
    @RequestMapping("/cart")
    public String cart()
    {
        return "cart.html";
    }
    @RequestMapping("/savecart")
    public String savecart(@ModelAttribute("userInfo") userInfo userInfo,
                           @ModelAttribute("orderProduct")orderProduct orderProduct)
    {

        System.out.println(userInfo.toString());
        System.out.println(orderProduct.toString());

        productService.saveItem(userInfo);
        return "orderSuccess.html";
    }
}
