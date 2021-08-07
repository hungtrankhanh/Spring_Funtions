package com.zention.training.demos.myapp.business;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.zention.training.demos.myapp.data.MyRepository;

@Service
public class MyServiceImpl implements MyService, EnvironmentAware, ApplicationContextAware {
	private MyRepository repository;
	
	private Environment env;
	
	@Value("${service.baseURL}")
	private String SERVICE_BASEURL;
	@Value("${my.name}")
	private String name;
	@Autowired
	public MyServiceImpl(MyRepository repository) {
		this.repository = repository;
	}
    @Override
	public void doBusinessLogic() {
        System.out.println("Doing MyServiceImpl : " + name + "  env = " + Arrays.toString(env.getActiveProfiles()));
        System.out.println("connecting to " + SERVICE_BASEURL);
        repository.doQuery();
    }
    
	@Override
	public void setEnvironment(Environment environment) {
		// TODO Auto-generated method stub
		this.env = environment;
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
        System.out.println("Application Context starting !!!");
	}

}
