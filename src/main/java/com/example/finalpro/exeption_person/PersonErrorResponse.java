package com.example.finalpro.exeption_person;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonErrorResponse {
    private String message;
    private Date timestamp;

}
