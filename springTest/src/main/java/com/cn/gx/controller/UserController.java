package com.cn.gx.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    String message = "Welcome to Spring!";
    @Resource
    private User user;
    @RequestMapping("/test")
    public void showMessage() {
    	System.out.println(message);
    	user.setName("注解输入");
    	user.intrude();
    }
    public static void main(String[] args) {
    	//1.硬编码  User user =  new User();    
    	//以上方式如果需要将User user =  new Student(); 时需要修改代码，而依赖注入则不需要修改这些代码直接修改配置文件就可以
    	
    	//2.依赖注入，实现了三种方式 a.构造注入     b.set注入       c.注解注入，具体配置在src/main/resources/applictionContext.xml
		//加载 spring 配置文件,根据创建对象,注解方式注入时web工程在配置中加载
		ApplicationContext ac = new ClassPathXmlApplicationContext("applictionContext.xml");
		//获取bean
		User user = ac.getBean("user",User.class);
		user.setName("GX");
		user.intrude();
		
	}
}
