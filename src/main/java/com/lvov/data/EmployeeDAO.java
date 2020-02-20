package com.lvov.data;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

@Component
public class EmployeeDAO {
    private EntityManagerFactory Emf;
    private EntityManager Em;
    @Autowired
    public void setEmf(EntityManagerFactory emf)
    {
        Emf = emf;
        if (Em == null)
        Em = Emf.createEntityManager();
        init();
    }
    
    @Transactional
    public void init()
    {
        
        if (Em != null){
            Session session = (Session) Em.getDelegate();
            Transaction tx = session.beginTransaction();
            
                Employee emp = new Employee();
            emp.setEmployeeId(1);
            if (!session.contains(emp)){
                emp.setFirstName("Иван");
                emp.setLastName("Иванов");
                session.persist(emp);
                tx.commit();
                session.flush();
            }
        }
    }
}
