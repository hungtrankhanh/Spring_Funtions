package com.zention.training.demos.myapp;

public class MyService {
	private MyRepository repository;
	
	public MyService(MyRepository repository) {
		this.repository = repository;
	}
    public void doBusinessLogic() {
        System.out.println("Doing something important!");
        repository.doQuery();
    }

}
