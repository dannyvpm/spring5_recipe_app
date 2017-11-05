package com.dannyss.spring5_recipe_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","index"})

    public String getIndex() {
        System.out.println("print");
        return "index";
    }
}
