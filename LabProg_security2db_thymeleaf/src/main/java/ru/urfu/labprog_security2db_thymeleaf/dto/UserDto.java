package ru.urfu.labprog_security2db_thymeleaf.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;

    @NotEmpty
    private String firstname;

    @NotEmpty
    private String lastName;

    @NotEmpty(message = "Email should be not empty")
    @Email
    private String email;

    @NotEmpty(message = "Password should be not empty")
    private String password;
}