package com.example.UserPortion.Dto.UserResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateResponse {
    private String id;

    private String name;

    private String email;

    private String about;



}
