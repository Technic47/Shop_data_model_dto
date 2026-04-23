package ru.kuznetsov.shop.represent.dto.auth;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginPasswordDto {
    private String login;
    private String password;
}
