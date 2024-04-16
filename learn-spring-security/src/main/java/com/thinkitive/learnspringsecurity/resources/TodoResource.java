package com.thinkitive.learnspringsecurity.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoResource {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private static final List<Todo> TODO_LIST = List.of(new Todo("Thinkitive", "ReactJs"),
            new Todo("CodeWithHarry", "NextJs"));

    @GetMapping("/todos")
    public List<Todo> retriveAllTodos(){
        return TODO_LIST;
    }

    @GetMapping("/users/{username}/todos")
    public Todo retriveTodosForSpecificUser(@PathVariable String username){
        return TODO_LIST.get(0);
    }

    @PostMapping("/users/{username}/todos")
    public void  createTodosForSpecificUser(@PathVariable String username, @RequestBody Todo todo){
        logger.info("create {} for {} ", todo.username());
    }
}
record Todo (String username, String description){}