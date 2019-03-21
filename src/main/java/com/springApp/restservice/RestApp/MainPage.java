package com.springApp.restservice.RestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {

    String mainPageHtml = "Merhaba";

    @RequestMapping(value = "/")
    public String mainPage(){
        return mainPageHtml;
    }
}
