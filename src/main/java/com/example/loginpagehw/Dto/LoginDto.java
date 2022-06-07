package com.example.loginpagehw.Dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class LoginDto {

    private Long id;

    @NotEmpty(message = "mail boş bırakılamaz!")
    @Email(message = "doğru formatta mail girilmedi!")
    private String mail;

    @NotEmpty(message = "şifre boş bırakılamaz!")
    private String password;

}
