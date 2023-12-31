package com.jenkins.test.jenkinstest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins-test")
public class HelloController {


    @GetMapping("/hello")
    public ResponseEntity<String> hello() {

        return new ResponseEntity<>("Hello2", HttpStatus.OK);
    }
}