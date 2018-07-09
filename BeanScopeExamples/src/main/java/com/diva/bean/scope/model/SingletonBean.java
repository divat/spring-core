package com.diva.bean.scope.model;

public class SingletonBean {
	
	private String name;
	
	public SingletonBean(){
		System.out.println("Returns a single bean instance per IOC.");
	}
	
	public SingletonBean(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
