package com.in28minutes.springboot.LearnJPA40.course;

import com.in28minutes.springboot.LearnJPA40.course.CourseJpaRepository;
import com.in28minutes.springboot.LearnJPA40.course.jdbc.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS now!", "in28minutes"));
        repository.insert(new Course(2, "Learn Azure now!", "in28minutes"));
        repository.insert(new Course(3, "Learn DevOps now!", "in28minutes"));

        repository.deleteById(1);
        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
