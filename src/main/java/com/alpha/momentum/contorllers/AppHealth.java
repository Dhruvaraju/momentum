package com.alpha.momentum.contorllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppHealth {

    @GetMapping("/app")
    public String appStatus(){
        return "App Works !!";
    }
}
