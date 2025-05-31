package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor // Required by JPA
public class UserDto {

    // private Long id;

    private String name;

    private String email;
}
