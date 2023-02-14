package com.in28minutes.springboot.LearnJPA40.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Primary;
import jakarta.persistence.Column;

@Entity //(name="Course_Details")  You can do this if you want
public class Course {

    @Id
    private long id;
    @Column(name="name") //(name="name") is not mandatory but you can change the name if you want to
    private String name;
    @Column(name="author")
    private String author;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public  Course() {

    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
