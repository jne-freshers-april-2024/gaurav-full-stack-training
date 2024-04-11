package com.thinkitive.learnspringboot2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retriveAllCourse() {
        return Arrays.asList(
                new Course(1, "Learn SpringBoot", "Thinkitive"),
                new Course(2, "Learn React", "Thinkitive"),
                new Course(3, "Learn Node", "YouTube"),
                new Course(4, "NextJs", "CWH"),
                new Course(5, "React Native", "ABM"),
                new Course(5, "Flutter", "GG"),
                new Course(5, "Android", "GFG")
//                new Course(5, "Android", "GFG"),
//                new Course(5, "Java", "GFG")
        );
    }
}