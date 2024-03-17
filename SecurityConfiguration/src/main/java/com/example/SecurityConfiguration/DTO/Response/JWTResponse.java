package com.example.SecurityConfiguration.DTO.Response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class JWTResponse {
    private String jwtToken;

    private String  username;
}
