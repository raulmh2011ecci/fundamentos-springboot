package com.fundamenrtos.springboot.fundamentos.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Testcontroller {


    @RequestMapping
     @ResponseBody
     public ResponseEntity<String> function(){
         return new ResponseEntity<>("Hello from controller un cambio con otro", HttpStatusCode.valueOf(200));
    }
}
