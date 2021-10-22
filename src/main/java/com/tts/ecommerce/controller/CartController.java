package com.tts.ecommerce.controller;

import com.tts.ecommerce.model.Product;
import com.tts.ecommerce.model.User;
import com.tts.ecommerce.service.ProductService;
import com.tts.ecommerce.service.EndUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


//Note that we are autowiring two different dependencies here
//while this will work effectively, it is not considered best practice
//when you have multiple dependencies
//@Controller
//@ControllerAdvice
public class CartController {

//
//    @Autowired
//    ProductService productService;
//
//    @Autowired
//    UserService userService;
//
//    //instead we should make a constructor-based dependency injection
//    //spring will automatically find a candidate dependency injection
//    public CartController(ProductService productService, UserService userService
//    ) {this.productService = productService;
//        this.userService = userService;
//    }
//
//    @ModelAttribute("loggedInUser")
//    public User loggedInUser() {
//        return userService.getLoggedInUser();
//    }
//
//    @ModelAttribute("cart")
//    public Map<Product, Integer> cart() {
//        User user = loggedInUser();
//        if (user == null) return null;
//        System.out.print( "Getting cart");
//        return user.getCart();
//    }
//
//
//    @ModelAttribute("list")
//    public List<Double> list() {
//        return new ArrayList<>();
//    }
//
//    @GetMapping("/cart")
//    public String showCart() {
//        return "cart";
//    }
//
//    @PostMapping("/cart")
//    public String addtoCart(@RequestParam long id) {
//        Product p = productService.findById(id);
//        setQuantity(p, cart().getOrDefault(p, 0)+1);
//        return "cart";
//    }
//
//    @PatchMapping("/cart")
//    public String updateQuantities(@RequestParam long[] id, @RequestParam int[] quantity) {
//        for (int i = 0; i < id.length; i++) {
//            Product p = productService.findById(id[i]);
//            setQuantity(p, quantity[i]);
//        }
//        return "cart";
//    }
//
//    @DeleteMapping("/cart")
//    public String removeFromCart(@RequestParam long id) {
//        Product p = productService.findById(id);
//        setQuantity(p, 0);
//        return "cart";
//    }
//
//    private void setQuantity(Product p, int quantity) {
//        if (quantity > 0) {
//            cart().put(p, quantity);
//        } else {
//            cart().remove(p);
//
//            userService.updateCart(cart());
//        }
//
//
//    }

}
