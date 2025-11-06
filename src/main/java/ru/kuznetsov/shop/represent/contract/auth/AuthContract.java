package ru.kuznetsov.shop.represent.contract.auth;


import ru.kuznetsov.shop.represent.dto.auth.LoginPasswordDto;
import ru.kuznetsov.shop.represent.dto.auth.TokenDto;
import ru.kuznetsov.shop.represent.dto.auth.UserDto;

import java.util.Collection;

public interface AuthContract {

    TokenDto getToken(LoginPasswordDto authHeader);

    Boolean isTokenValid(String token);

    Collection<String> getUserRoles(String token);

    UserDto getUserInfo(String token);
}
