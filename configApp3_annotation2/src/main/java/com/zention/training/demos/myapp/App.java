package com.zention.training.demos.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static void main(String[] args) {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	MyService bean = ctx.getBean(MyService.class);
    	bean.doBusinessLogic();
    }

}