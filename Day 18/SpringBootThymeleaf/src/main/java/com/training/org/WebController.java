package com.training.org;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class WebController {
    private List<String> wordCollection = Arrays.asList("a","b");
    @RequestMapping(value="/index")
    public String index(Model model)
    {
        model.addAttribute("wColl", wordCollection);
        model.addAttribute("message", "Spring web app");
        return "index";}
        @RequestMapping(value="/hello")
        public String getDetails(@RequestParam(name="name", required=false,defaultValue = " ") String name, Model model)
        {
            model.addAttribute("name", name);
            return "welcome";}
}
