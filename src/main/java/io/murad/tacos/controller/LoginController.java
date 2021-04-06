package io.murad.tacos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping(value = "/login",method = {RequestMethod.POST,RequestMethod.GET})
    public String login(){
        return "login";
    }
}
