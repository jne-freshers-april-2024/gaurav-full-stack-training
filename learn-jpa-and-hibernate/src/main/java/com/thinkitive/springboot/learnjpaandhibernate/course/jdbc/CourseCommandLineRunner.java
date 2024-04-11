package com.thinkitive.springboot.learnjpaandhibernate.course.jdbc;

import com.thinkitive.springboot.learnjpaandhibernate.Course;
import com.thinkitive.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.thinkitive.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(2, "React Jpa", "Gaurav"));
        repository.save(new Course(3, "Next Jpa", "thinkitive"));
        repository.save(new Course(4, "React Native Jpa", "thinkitive"));

        repository.deleteById(2l);
        System.out.println(repository.findById(3l));
        System.out.println(repository.findById(4l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("thinkitive"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("Next Jpa"));
        System.out.println(repository.findByName(""));
    }
}
