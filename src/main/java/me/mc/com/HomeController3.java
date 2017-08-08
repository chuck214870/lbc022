package me.mc.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by oracle on 8/5/17.
 */
//@Controller
public class HomeController3 {
    //@RequestMapping("/")
    public String homePage(){
        return "hometemplate3";
    }
}
