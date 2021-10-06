package com.begin.learnspringframework.sample.enterprise.flow.bussiness;

import com.begin.learnspringframework.sample.enterprise.flow.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {
    @Autowired
    private DataService dataService;

    public long calculateSum(){
        List<Integer> data = dataService.retrieveData();
        return data.stream().reduce(Integer::sum).get();
    }
}