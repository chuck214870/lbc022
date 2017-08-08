package me.mc.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * Created by oracle on 8/7/17.
 */
@Controller
public class HomeController7 {

    @GetMapping("/tvform")
    public String loadTVForm(Model model){
        model.addAttribute("tvshow7", new Tvshow7());
        return "tvform7";
    }

    @PostMapping("/tvform")
    public String processTVForm(@Valid Tvshow7 tvshow7, BindingResult result){
        if (result.hasErrors()){
            return "tvform7";
        }
        return "tvshowconfirm7";
    }
}
