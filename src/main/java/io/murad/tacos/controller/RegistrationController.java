package io.murad.tacos.controller;

import io.murad.tacos.model.RegistrationForm;
import io.murad.tacos.model.User;
import io.murad.tacos.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
@Slf4j
public class RegistrationController {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public RegistrationController(UserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public String registerForm(Model model) {
//        model.addAttribute("user",new User());
        return "registration";
    }
    @PostMapping
    public String processRegistration(RegistrationForm form) {
        userService.saveUser(form.toUser(passwordEncoder));
        log.info("User register successfully");
        return "redirect:/login";
    }
}
