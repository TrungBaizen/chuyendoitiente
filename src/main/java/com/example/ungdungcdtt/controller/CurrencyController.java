package com.example.ungdungcdtt.controller;

import com.example.ungdungcdtt.model.CurrencyModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurrencyController {
    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }
    @PostMapping("/home")
    public ModelAndView home(@RequestParam double amount) {
        CurrencyModel currency = new CurrencyModel(amount);
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("currency",currency);
        return modelAndView;
    }
}
