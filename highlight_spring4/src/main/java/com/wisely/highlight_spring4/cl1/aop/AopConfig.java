package com.wisely.highlight_spring4.cl1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 * Created by songv on 2017/5/17.
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.cl1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
