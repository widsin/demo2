package net.xdclass.demo2.net.xdclass.demo2.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SampleController {

    @RequestMapping("/")
    public String index() {
        return "Hello Worlds6125616";
    }

}
