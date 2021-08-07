package com.zention.training.demos.myapp.business;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeLoggingAspect {
	
	@Before("execution(void MyService.doBusinessLogic())")
	public void intercept() {
		System.out.println("Intercepted !");
	}
}
