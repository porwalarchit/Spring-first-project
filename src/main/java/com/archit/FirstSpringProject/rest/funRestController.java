package com.archit.FirstSpringProject.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {
//    @Value("${owner.name}")
//    private String Ownername;
//    private String name = Ownername;
//
//    public String getOwnername() {
//        return name;
//    }

    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day ";
    }
}
