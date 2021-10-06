package com.begin.learnspringframework.sample.enterprise.flow.web;

import com.begin.learnspringframework.sample.enterprise.flow.bussiness.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private BusinessService businessService;

    @GetMapping("/sum")
    public long display() {
        return businessService.calculateSum();             //when user enter url/sum it returns sum
    }
}
