package com.example.rlotgatewayservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    String message;

}
