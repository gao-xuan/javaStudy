package com.cn.gx.controller;

import org.springframework.stereotype.Service;
/**
 * @Component：可以用于注册所有bean
 * @Repository：主要用于注册dao层的bean
 * @Controller：主要用于注册控制层的bean
 * @Service：主要用于注册服务层的bean
 * 
 * */
@Service(value = "user")  //注解注入相当于<bean id="user" class=""/>
public class User {
	private String name;
	private College college;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public User(String name, College college) {
		super();
		this.name = name;
		this.college = college;
	}
	public User(){
		super();
	}
	public void intrude() {
		// TODO Auto-generated method stub
		System.out.println("i am  user " + name);
		
	}
	
}
