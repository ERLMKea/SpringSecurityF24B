package org.example.springsecurityf24b.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    @GetMapping("/myBalance")
    public String getBalanceDetails() {
        return "Here are the balancedetails from db";
    }
}

