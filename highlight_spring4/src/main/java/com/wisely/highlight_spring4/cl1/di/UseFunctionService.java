package com.wisely.highlight_spring4.cl1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by songv on 2017/5/17.
 */
@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;


    public String SayHello(String word) {
        return functionService.sayHello(word);
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
}
