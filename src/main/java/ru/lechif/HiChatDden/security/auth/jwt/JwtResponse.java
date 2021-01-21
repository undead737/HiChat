package ru.lechif.HiChatDden.security.auth.jwt;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class JwtResponse {
    String accessToken;
    String userName;
    String name;
    List<String> authorities;
}
