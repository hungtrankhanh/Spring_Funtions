package com.zention.training.demos.myapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.zention.training.demos.myapp.business.MyService;
import com.zention.training.demos.myapp.business.MyServiceImpl;

public class App {

    public static void main(String[] args) {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	MyService bean = ctx.getBean(MyServiceImpl.class);
    	bean.doBusinessLogic();
    }

}