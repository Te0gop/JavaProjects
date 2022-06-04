package com.spring.carwash.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    private JavaMailSender javaMailSender;

    @RequestMapping(value = {"/", "/index.html"})
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("index");

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo("xxx@gmail.com");
        simpleMailMessage.setCc("yyy@gmail.com");
        simpleMailMessage.setText("Index is accessed.");

        javaMailSender.send(simpleMailMessage);

        return modelAndView;
    }

    @RequestMapping(value = "/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("login");
        return modelAndView;
    }
}
