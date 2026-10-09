package com.example.Tut1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class APIController {
    @GetMapping("/home")
    public String home(){
        return "Welcome World";
    }

    @GetMapping("/info")
    public String info (){
        return "ver.  1.0.0";
    }

    @GetMapping("/goodbye")
    public String goodbye (){
        return "Get Lost" ;
    }
}
