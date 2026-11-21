package com.educandoweb.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.webservice.model.User;
import com.educandoweb.webservice.service.UserService;


@RestController 
@RequestMapping(value = "/users")
public class UserController {

    //endpoint para usuários

    @Autowired
    private UserService service;


    @GetMapping 
    public ResponseEntity<List<User>> findAll(){ //container de resposta http
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list); //ok -> sucesso  200 | body -> insere o conteudo dentro do body http
    }

    @GetMapping(value = "/{id}" )
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    
}
