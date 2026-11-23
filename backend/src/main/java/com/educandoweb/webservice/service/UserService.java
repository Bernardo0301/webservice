package com.educandoweb.webservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.educandoweb.webservice.repository.UserRepository;
import java.util.List;
import java.util.Optional;

import com.educandoweb.webservice.model.User;

//@Component registra classe como componente spring -> injeção automatica do autowired
@Service 
public class UserService {

    @Autowired 
    private  UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional <User> obj = repository.findById(id);
        return obj.get();
    }

    public Page<User> findAllPaged(Pageable pageable) {
    return repository.findAll(pageable);
}
}
