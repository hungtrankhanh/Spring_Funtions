package com.zention.training.demos.myapp;

public class MyService2 {
	private MyRepository repository;
	
    public void doBusinessLogic() {
        System.out.println("Doing something important!");
        repository.doQuery();
    }

	public MyRepository getRepository() {
		return repository;
	}

	public void setRepository(MyRepository repository) {
		this.repository = repository;
	}
    
}
