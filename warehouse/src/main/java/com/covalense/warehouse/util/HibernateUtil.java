package com.covalense.warehouse.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component("hibernateUtil")
public class HibernateUtil {
@Autowired
private SessionFactory sessionFactory;
public Session openSession() {
	return sessionFactory.openSession();
}
}
