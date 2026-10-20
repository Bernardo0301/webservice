package com.educandoweb.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.webservice.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
