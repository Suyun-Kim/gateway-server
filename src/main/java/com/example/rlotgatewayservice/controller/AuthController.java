package com.example.rlotgatewayservice.controller;

import com.example.rlotgatewayservice.common.StatusEnum;
import com.example.rlotgatewayservice.model.User;
import com.example.rlotgatewayservice.model.vo.AuthRequest;
import com.example.rlotgatewayservice.model.vo.Response;
import com.example.rlotgatewayservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/auth/token")
    public ResponseEntity<?> signin(@RequestBody AuthRequest request) {

        log.info(request.toString());

        userService.signin(request);

        return new ResponseEntity<>(new Response<>(StatusEnum.OK, true), HttpStatus.OK);
    }
}
