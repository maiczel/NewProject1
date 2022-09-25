package org.isa.newprojekt1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {
    @RequestMapping("/hello-world")
    public String hello() {

        return "hello";
    }
}
