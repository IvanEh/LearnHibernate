package com.gmail.at.ivanehreshi;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Hibernate {
    SessionFactory sessionFactory;

    public Hibernate() {
        setUp();
    }

    private void setUp() {
        StandardServiceRegistry serviceRegistry =
                new StandardServiceRegistryBuilder().configure().build();

        MetadataSources metadataSources =
                new MetadataSources(serviceRegistry);
        Metadata metadata = metadataSources
                .buildMetadata();
        this.sessionFactory = metadata.buildSessionFactory();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
