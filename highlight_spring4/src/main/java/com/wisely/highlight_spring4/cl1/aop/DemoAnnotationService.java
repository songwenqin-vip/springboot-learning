package com.wisely.highlight_spring4.cl1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by songv on 2017/5/17.
 */
@Service
public class DemoAnnotationService {
    @Action(name="annotation noted add operation")
    public void add(){}
}
