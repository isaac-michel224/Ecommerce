package com.tts.ecommerce.controller;


import lombok.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheckoutController {
}

@Value("${STRIPE_PUBLIC_KEY}")
private String stripePublicKey;

@RequestMapping
public String checkout(Model model) {
    model.addAttribute("amount", );
}


// https://stripe.com/docs/testing