package ru.kuznetsov.shop.represent.dto.auth;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private UUID id;
    private String username;
    private String email;
    private Boolean emailVerified;
}
