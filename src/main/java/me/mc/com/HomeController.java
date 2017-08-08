package me.mc.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by oracle on 8/5/17.
 */
//@Controller
public class HomeController {
    //@RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myvar", "Say hello to the people");
        return "hometemplate";
    }
}
