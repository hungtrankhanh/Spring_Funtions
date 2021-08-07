package com.zention.training.demos.myapp.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.zention.training.demos.myapp.data.MyRepository;

@Service
public class MyServiceImpl implements MyService {
	private MyRepository repository;
	
	@Autowired
	public MyServiceImpl(@Qualifier("myRepositoryImpl") MyRepository repository) {
		this.repository = repository;
	}
    @Override
	public void doBusinessLogic() {
        System.out.println("Doing MyServiceImpl!");
        repository.doQuery();
    }

}
