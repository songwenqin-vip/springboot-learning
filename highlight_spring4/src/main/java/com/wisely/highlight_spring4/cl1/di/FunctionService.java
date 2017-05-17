package com.wisely.highlight_spring4.cl1.di;

import org.springframework.stereotype.Service;

/**
 * Created by songv on 2017/5/17.
 */

@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word+"!";
    }
}
