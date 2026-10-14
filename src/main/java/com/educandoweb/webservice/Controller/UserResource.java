package com.educandoweb.webservice.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.webservice.model.User;

@RestController 
@RequestMapping(value = "/users")
public class UserResource {

    //endpoint para usuários

    @GetMapping 
    public ResponseEntity<User> findAll(){ //container de resposta http
        User u = new User(1L,"maria", "maria@gmail.com","99999", "12345");
        return ResponseEntity.ok().body(u); //ok -> sucesso  200 | body -> insere o conteudo dentro do body http
    }
}
