package com.jeantravassos.rest.webservice.objectivesssservice.controllers;

import com.jeantravassos.rest.webservice.objectivesssservice.beans.BasicAuthenticationBean;
import com.jeantravassos.rest.webservice.objectivesssservice.beans.HelloWorldBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Slf4j
public class BasicAuthenticationController {

    @GetMapping("/basicauth")
    public BasicAuthenticationBean helloWorldBean(){
        log.info("Entrou no basic auth bean!");

//        throw new RuntimeException("Some error has happened! Contact support at ****-****.");
        return new BasicAuthenticationBean("You are authenticated!");
    }
}
