package com.gmail.at.ivanehreshi;


import com.gmail.at.ivanehreshi.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Application {
    public static void main(String[] args) {
        Hibernate hibernate = new Hibernate();

        Session session = hibernate.getSessionFactory().openSession();
        session.beginTransaction();

        Student student = new Student("Ivan", "Ehreshi");
        session.persist(student);
        System.out.println(student);;
//
//        session.getTransaction().commit();
//        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//                .build();
//        MetadataSources metadataSource = new MetadataSources(serviceRegistry);
//        SessionFactory sessionFactory = metadataSource.buildMetadata().buildSessionFactory();

   }
}
