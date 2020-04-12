package com.jeantravassos.rest.webservice.objectivesssservice.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardcodedService {

    private static List<Todo> todos = new ArrayList<>();
    private static long idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "jean", "Learn to Dance", new Date(), false));
        todos.add(new Todo(++idCounter, "jean", "Learn about microservices", new Date(), false));
        todos.add(new Todo(++idCounter, "jean", "Learn Angular", new Date(), false));
        todos.add(new Todo(++idCounter, "jean", "Watch Netflix", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }


    public Todo deleteById(long id) {
        Todo todo = findById(id);

        if (todo == null)
            return null;

        if (todos.remove(todo))
            return todo;

        return null;
    }

    public Todo findById(long id) {
        for (Todo todo: todos) {
            if (todo.getId() == id){
                return todo;
            }
        }
        return null;
    }

    public Todo save(Todo todo) {
        if (todo.getId() == null || todo.getId() == -1 || todo.getId() == 0) {
            todo.setId(++idCounter);
        } else {
            deleteById(todo.getId());
        }
        todos.add(todo);
        return todo;
    }
}
