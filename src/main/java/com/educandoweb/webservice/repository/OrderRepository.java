package com.educandoweb.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.webservice.model.Order;


//@Repository -> Não necessário pois UserRepository já está herdando de JpaRepository
//que ja está registrado no spring
public interface OrderRepository extends JpaRepository<Order, Long>{

}
