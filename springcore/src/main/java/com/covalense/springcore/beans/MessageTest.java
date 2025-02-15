package com.covalense.springcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;
@Log
public class MessageTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		MessageBean messageBean = (MessageBean)applicationContext.getBean("messageBean");
		log.info(messageBean.getMessage());
	}

}
