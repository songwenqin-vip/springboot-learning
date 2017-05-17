package com.wisely.highlight_spring4.cl1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by songv on 2017/5/17.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();
        demoMethodService.add();

        context.close();
    }
}
