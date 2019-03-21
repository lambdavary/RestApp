package com.springApp.restservice.RestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetClass {

    String ret = "<ul>List</ul>" +
            "<li>asd</li>";

    @RequestMapping("/greetPage")
    public String index(){
        return ret + "<h1>Hello World!<h1>";
    }

}
