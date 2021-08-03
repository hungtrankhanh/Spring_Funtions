package com.zention.training.demos.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
    	MyService bean = ctx.getBean(MyService.class);
    	bean.doBusinessLogic();
    	
    	MyService2 bean2 = ctx.getBean(MyService2.class);
    	bean2.doBusinessLogic();
    }

}