package com.example.demo.CRUD.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponseDto {
    private String id;
    private String name;
    private String address;
    private String salary;

    public CustomerResponseDto(String id, String name, String address, double salary) {
    }
}
