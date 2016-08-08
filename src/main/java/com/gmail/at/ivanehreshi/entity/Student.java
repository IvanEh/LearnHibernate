package com.gmail.at.ivanehreshi.entity;


import com.gmail.at.ivanehreshi.entity.components.Name;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Embedded
    Name name;

    public Student(String first, String last) {
        this.name = new Name(first, last);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
