package org.springcore.controller;

import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

    public String hello(){
       return "Hello Controller ";
    }
}
