package com.zention.training.demos.myapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.zention.training.demos.myapp.business.MyService;
import com.zention.training.demos.myapp.business.MyServiceImpl;
import com.zention.training.demos.myapp.config.DevelopmentConfig;
import com.zention.training.demos.myapp.config.ProductionConfig;
import com.zention.training.demos.myapp.data.MyRepository;

public class App {

    public static void main(String[] args) {
    	System.setProperty("spring.profiles.active", "local");
    	
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(DevelopmentConfig.class, ProductionConfig.class);
    	MyRepository db_bean = ctx.getBean(MyRepository.class);
    	db_bean.doQuery();
    	
    	MyService sr_bean = ctx.getBean(MyService.class);
    	sr_bean.doBusinessLogic();
    }

}