package com.example.demo.CRUD.service;

import com.example.demo.CRUD.dto.request.CusotmerDto;
import com.example.demo.CRUD.dto.response.CustomerResponseDto;

import java.util.List;

public interface CustomerService {

    public String saveCustomer(CusotmerDto dto);
    public String findCustomer(String id);
    public String updateCustomer(CusotmerDto dto, String id);
    public String deleteCustomer(String id);
    public List<CustomerResponseDto> findAllCustomer();

}
