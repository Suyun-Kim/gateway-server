package com.example.rlotgatewayservice.model;

import lombok.*;

@Builder
@Setter
@Getter
@ToString
@AllArgsConstructor
public class TokenInfo {

    private String grantType;

    private String accessToken;

    private String refreshToken;

}
