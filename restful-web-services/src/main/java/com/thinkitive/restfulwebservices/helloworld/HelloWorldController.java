package com.thinkitive.restfulwebservices.helloworld;

// REST API

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldController {
    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource){
        this.messageSource = messageSource;
    }

//    @RequestMapping(method = RequestMethod.GET, path = "/hello-world" )
//    public String helloWorld(){
//        return "Hello World";
//    }

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello Thinkitive";
    }

    @GetMapping(path = "hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    // Path Parameters
    // /user/{id}/todos/{id} => /users/2/todos/200
    // hellp-world/path-variable/{name}
    // hello-world/path-variable/think

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, "+ name));
    }

    @GetMapping(path = "/hello-world-internationalized")
    public String helloWorldInternalized(){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
//        return "Hello World V2";
    }
}
