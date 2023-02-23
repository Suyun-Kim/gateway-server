package com.example.rlotgatewayservice.model.vo;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class AuthRequest {

    @NotNull(message = "UserID is required")
    private String userId;

    @NotNull(message = "PassWord is required")
    private String userPw;
}
