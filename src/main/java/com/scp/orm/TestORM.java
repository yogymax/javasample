package com.scp.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//cfg -- mapping
public class TestORM {

	
		public static void main(String[] args) {
			EmpInfo e1= new EmpInfo(111,"ATAAA","Pu2ne",28683.45);
			EmpInfo e2= new EmpInfo(222,"FAAAA","Pu3ne",25883.45);
			EmpInfo e3= new EmpInfo(333,"XAAAA","Pu4ne",42883.45);
			Configuration conf = new Configuration();
			conf.configure();//default name "hiberate.cfg.xml"
			SessionFactory sfactory = conf.buildSessionFactory();
			Session session = sfactory.openSession();//give me one connection
			Transaction tr = session.beginTransaction();
			session.save(e1); //insert 
			session.save(e2); //insert
			session.save(e3); //insert
			session.flush();
			tr.commit();
			
			
			
			
			
			
		}
}
