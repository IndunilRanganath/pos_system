package com.example.demo.CRUD.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class CusotmerDto {
    private String name;
    private String address;
    private double salary;


}
