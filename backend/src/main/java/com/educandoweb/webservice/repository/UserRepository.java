package com.educandoweb.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.webservice.model.User;


//@Repository -> Não necessário pois UserRepository já está herdando de JpaRepository
//que ja está registrado no spring
public interface UserRepository extends JpaRepository<User, Long>{

}
