package com.example.demo.CRUD.api;

import com.example.demo.CRUD.dto.request.CusotmerDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")

public class CusotmerController {
    @PostMapping("/create")
    public String save(@RequestBody CusotmerDto dto){
        return dto.toString();
    }

    @GetMapping("/{id}")
    public String findCustomer(@PathVariable String id){
        return id + " - customer";
    }

    @PutMapping(value = "/modiy", params = {"id"})
    public String updateCustomer(@RequestBody CusotmerDto dto, @RequestParam String id){
        return  dto+ " - " + id;
    }

    @DeleteMapping("/remove/{id}")
    public String deleteCustomer(@PathVariable String id){
        return id + " - customer";
    }

    @GetMapping("/list")
    public String findAllCustomer(){
        return  "all customer";
    }
}
