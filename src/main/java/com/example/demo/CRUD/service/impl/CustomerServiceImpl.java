package com.example.demo.CRUD.service.impl;

import com.example.demo.CRUD.dto.request.CusotmerDto;
import com.example.demo.CRUD.dto.response.CustomerResponseDto;
import com.example.demo.CRUD.entity.Customer;
import com.example.demo.CRUD.repo.CustomerRepo;
import com.example.demo.CRUD.service.CustomerService;
import com.example.demo.CRUD.util.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private IdGenerator idGenerator;

    @Override
    public String saveCustomer(CusotmerDto dto) {
        Customer c1 = new Customer(
          idGenerator.generateId(10), dto.getName(), dto.getAddress(), dto.getSalary()
        );

        customerRepo.save(c1);
        return c1.getId() + " Saved";
    }

    @Override
    public String findCustomer(String id) {

        return customerRepo.findById(id).orElse(null).toString();
    }

    @Override
    public String updateCustomer(CusotmerDto dto, String id) {
        Customer c = customerRepo.findById(id).orElse(null);
        if (null ==c) return "Not Found";
        c.setName(dto.getName());
        c.setAddress(dto.getAddress());
        c.setSalary(dto.getSalary());
        return c.getName()+ " was updated.!";

    }

    @Override
    public String deleteCustomer(String id) {
        customerRepo.deleteById(id);
        return id+ " was deleted.!";
    }

    @Override
    public List<CustomerResponseDto> findAllCustomer() {
        List<CustomerResponseDto> dtoList = new ArrayList<>();
        List<Customer> list = customerRepo.findAll();
        for (Customer c :list
             ) {
            dtoList.add(new CustomerResponseDto(
                    c.getId(), c.getName(),c.getAddress(), c.getSalary()
            ));
        }
        return dtoList;
    }
}
