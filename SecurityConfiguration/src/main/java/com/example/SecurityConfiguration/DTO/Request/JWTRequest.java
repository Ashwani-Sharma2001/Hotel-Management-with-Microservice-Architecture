package com.example.SecurityConfiguration.DTO.Request;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class JWTRequest {
    private String username;

    private String password;
}
