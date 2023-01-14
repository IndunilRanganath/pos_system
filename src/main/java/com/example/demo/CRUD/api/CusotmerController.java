package com.example.demo.CRUD.api;

import com.example.demo.CRUD.dto.request.CusotmerDto;
import com.example.demo.CRUD.dto.response.CustomerResponseDto;
import com.example.demo.CRUD.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")

public class CusotmerController {

    @Autowired
    CustomerService customerService;
    @PostMapping("/create")
    public String save(@RequestBody CusotmerDto dto){

        return customerService.saveCustomer(dto);
    }

    @GetMapping("/{id}")
    public String findCustomer(@PathVariable String id){
        return customerService.findCustomer(id);
    }

    @PutMapping(value = "/modiy", params = {"id"})
    public String updateCustomer(@RequestBody CusotmerDto dto, @RequestParam String id){

        return  customerService.updateCustomer(dto, id);
    }

    @DeleteMapping("/remove/{id}")
    public String deleteCustomer(@PathVariable String id){

        return customerService.deleteCustomer(id);
    }

    @GetMapping("/list")
    public List<CustomerResponseDto> findAllCustomer(){

        return  customerService.findAllCustomer();
    }
}
