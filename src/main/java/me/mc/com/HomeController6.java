package me.mc.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by oracle on 8/5/17.
 */
@Controller
public class HomeController6 {

    @GetMapping("/songform")
    public String loadSongForm(Model model){
        model.addAttribute("song6", new Song6());
        return "songform6";
    }

    @PostMapping("/songform")
    public String processSongForm(@ModelAttribute Song6 song6){
        return "confirmsong6";
    }
}
