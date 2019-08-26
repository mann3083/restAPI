package com.controller;

import com.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class Base {


    @RequestMapping(value="/one",produces = "application/json",method = RequestMethod.GET)
    public ResponseEntity<Employee> homeController(){

        Employee e1 = new Employee(1,"Manish");

        return new ResponseEntity<>(e1, HttpStatus.OK);
    }


    @RequestMapping(value="/many",produces = "application/json",method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> homeController2(){
        Employee e1 = new Employee(1,"Manish");
        Employee e2 = new Employee(2,"Kumar");
        Employee e3 = new Employee(3,"DBS");
        Employee e4 = new Employee(4,"AVP");
        List<Employee> newL = new LinkedList<>();
        newL.add(e1);
        newL.add(e2);
        newL.add(e3);
        newL.add(e4);
        return new ResponseEntity<>(newL, HttpStatus.OK);
    }
}
