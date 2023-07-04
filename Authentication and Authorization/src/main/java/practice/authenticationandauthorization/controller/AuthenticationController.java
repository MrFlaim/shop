package practice.authenticationandauthorization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import practice.authenticationandauthorization.dto.LoginRequest;
import practice.authenticationandauthorization.entity.User;
import practice.authenticationandauthorization.service.authentication.AuthenticationService;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/user/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return authenticationService.getUserByUsername(username);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();
        boolean isAuthenticated = authenticationService.authenticate(username, password);
        if (isAuthenticated) {
            return ResponseEntity.ok().build();
            //?
        } else {
            return (ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed"));
        }
    }

    @PostMapping("/logout")
    public void logout(String username) {
        authenticationService.logout(username);
    }
}