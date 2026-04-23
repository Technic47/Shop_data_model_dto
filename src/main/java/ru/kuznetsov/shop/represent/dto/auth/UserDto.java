package ru.kuznetsov.shop.represent.dto.auth;

import lombok.*;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private UUID id;
    private String username;
    private String email;
    private Boolean emailVerified;
}
