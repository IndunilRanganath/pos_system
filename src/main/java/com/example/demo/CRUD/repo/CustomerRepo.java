package com.example.demo.CRUD.repo;

import com.example.demo.CRUD.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface CustomerRepo extends JpaRepository<Customer, String> {
}
