package com.tts.ecommerce.controller;


import com.tts.ecommerce.model.ChargeRequest;
import com.tts.ecommerce.service.StripeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChargeController {

    @Autowired
    private StripeService service;

    @PostMapping("/charge")
    public String charge(ChargeRequest chargeRequest, Model model) {
        chargeRequest.setDescription("Example charge");
        chargeRequest.setCurrency(ChargeRequest.Currency.EUR);
        Charge charge = service.charge(chargeRequest);
        model.addAttribute("id", charge.getId());
        model.addAttribute("status", charge.getStatus());
        model.addAttribute("chargeId", charge.getId());
        model.addAttribute("balance_transaction", charge.getBalanceTransaction());
        return "result";
    }

    @ExceptionHandler(StripeException.class)
    public String handleError(Model model, StripeException e) {
        model.addAttribute("error", e.getMessage());
        return "result";
    }
}
