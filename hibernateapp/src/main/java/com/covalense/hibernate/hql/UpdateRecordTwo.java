package com.covalense.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class UpdateRecordTwo {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		//String hql = "update from EmployeeInfoBean set name=:nm where id=:eid";
		 String hql = "update from EmployeeInfoBean set name='"+args[0]+"' where id="+args[1]+"";
		Query query = session.createQuery(hql);
		//query.setParameter("eid", args[0]);
		//query.setParameter("nm", (args[1]) );
		int result;
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			result = query.executeUpdate();
			log.info("Record updated");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}

	}
}
