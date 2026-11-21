package com.educandoweb.webservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.webservice.repository.OrderRepository;
import java.util.List;
import java.util.Optional;

import com.educandoweb.webservice.model.Order;

//@Component registra classe como componente spring -> injeção automatica do autowired
@Service 
public class OrderService {

    @Autowired 
    private  OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional <Order> obj = repository.findById(id);
        return obj.get();
    }
}
