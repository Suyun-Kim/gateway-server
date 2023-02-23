package com.example.rlotgatewayservice.model.vo;

import com.example.rlotgatewayservice.model.UserRole;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthResponse {

    private String userId;
    private String userName;
    private String userEmail;
    private UserRole userRole;
    private String token;
}
