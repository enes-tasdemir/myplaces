package com.redev.myplaces.controller;

import com.redev.myplaces.auth.JwtUtil;
import com.redev.myplaces.dto.AuthenticateDto;
import com.redev.myplaces.dto.UserDto;
import com.redev.myplaces.entity.User;
import com.redev.myplaces.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthenticateController {
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;
    private final UserService userService;

    public AuthenticateController(AuthenticationManager authenticationManager, JwtUtil jwtUtil, UserService userService) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
        this.userService = userService;
    }
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody AuthenticateDto authenticate)  {

        try {
            Authentication authentication =
                    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticate.getEmail(), authenticate.getPassword()));
            String email = authentication.getName();
            User user = userService.getUserByEmail(email);
            String token = jwtUtil.createToken(user);
            return ResponseEntity.ok(new UserDto(user.getId(), user.getUserName(), user.getDisplayName(), user.getEmail(), token));

        }catch (BadCredentialsException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid username or password");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
