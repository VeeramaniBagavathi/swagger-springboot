package com.veera.test.swagger.impl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * Created by Veeramani Bagavathi
 * on 9/12/2017.
 */
@Data
public class User {
    private String firstName;
    private String lastName;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDate dob;
    private Address address;
    private String mobileNumber;
}
