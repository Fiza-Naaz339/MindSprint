package com.mindsprint.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/hello")
    public String getHello(){
        return "Hello from My New SpringBoot App";
    }
    @GetMapping("/employee")
    public Employee getEmployee(){
        return new Employee(1,"Fiza","I.T",123403456);
    }

}
