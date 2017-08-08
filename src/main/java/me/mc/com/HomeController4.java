package me.mc.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by oracle on 8/5/17.
 */
//@Controller
public class HomeController4 {

    //@RequestMapping("/loadform")
    public String loadFormPage(){
        return "formtemplate4";
    }

    //@RequestMapping("/processform")
    public String loadFormPage(@RequestParam("login") String login, Model model){
        model.addAttribute("loginval", login);
        return "confirm4";
    }
}
