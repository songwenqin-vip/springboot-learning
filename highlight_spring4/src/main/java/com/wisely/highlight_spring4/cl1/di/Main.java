package com.wisely.highlight_spring4.cl1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by songv on 2017/5/17.
 */
public class Main {
    public static String word;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = initialByJava();

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.SayHello(word));

        context.close();
    }

    public static AnnotationConfigApplicationContext initialByDi() {
        word = "di";
        return new AnnotationConfigApplicationContext(DiConfig.class);

    }

    public static AnnotationConfigApplicationContext initialByJava() {
        word = "java";
        return new AnnotationConfigApplicationContext(JavaConfig.class);
    }
}
