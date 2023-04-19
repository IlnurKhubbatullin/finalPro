package com.example.finalpro.models;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginCredentials {

    private String name;
    private String password;

}
