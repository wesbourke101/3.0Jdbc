package com.in28minutes.springboot.LearnJPA40.course;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJpaRepository {
    @Per
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }
}
