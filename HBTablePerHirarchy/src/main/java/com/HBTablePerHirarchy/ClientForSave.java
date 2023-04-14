package com.HBTablePerHirarchy;


import org.hibernate.*;
import org.hibernate.cfg.*;
public class ClientForSave {

    public static void main(String[] args)
    {
 
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); 
 
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        CreditCard c=new CreditCard();
 
        c.setPaymentId(5);
        c.setAmount(2000);
        c.setCreditCardType("Visa");

 
        
        Cheque c1=new Cheque();
        
        c1.setPaymentId(6);
        c1.setAmount(2500);
        c1.setChequeType("ICICI");

        
        
        Transaction tx = session.beginTransaction();
        session.save(c);
        session.save(c1);
        System.out.println("Object saved successfully.....!!");
        tx.commit();
        session.close();
        factory.close();
    }
 

}
