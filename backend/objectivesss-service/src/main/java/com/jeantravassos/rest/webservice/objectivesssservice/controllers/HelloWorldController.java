package com.jeantravassos.rest.webservice.objectivesssservice.controllers;

import com.jeantravassos.rest.webservice.objectivesssservice.beans.HelloWorldBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Slf4j
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World 2";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        log.info("Entrou no hello world bean!");

//        throw new RuntimeException("Some error has happened! Contact support at ****-****.");
        return new HelloWorldBean("Jean, bem vindo, meu caro!");
    }

    @GetMapping("/hello-world/path/{name}")
    public HelloWorldBean helloWorldPath(@PathVariable String name) {
        log.info(String.format("Hello World Path called : , %s", name));
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
