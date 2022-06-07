package com.example.loginpagehw.Controller;


import com.example.loginpagehw.Dto.LoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    //http://localhost:8088/login
    @GetMapping("login")
    public String getLogin(Model model){
        model.addAttribute("login_key", new LoginDto());
        return "login";
    }

    @PostMapping("login")
    public String postLogin(@Valid @ModelAttribute("login_key") LoginDto loginDto, BindingResult result){
        if (result.hasErrors()){
            return "login";
        }
        return "success";
    }
}
