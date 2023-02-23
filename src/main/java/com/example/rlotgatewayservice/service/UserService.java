package com.example.rlotgatewayservice.service;

import com.example.rlotgatewayservice.model.User;
import com.example.rlotgatewayservice.model.vo.AuthRequest;
import com.example.rlotgatewayservice.model.vo.AuthResponse;
import com.example.rlotgatewayservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    public AuthResponse signin (AuthRequest request) {

        String userId = request.getUserId();
        String userPw = request.getUserPw();

        Optional<User> user = userRepository.findByUserIdAndUserPw(userId, userPw);

        if (user.isEmpty()) {
            throw new BadCredentialsException("Invalid account information");
        }


        return null;
    }

    public Optional<User> getUser (String userId) {
        return userRepository.findById(userId);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
