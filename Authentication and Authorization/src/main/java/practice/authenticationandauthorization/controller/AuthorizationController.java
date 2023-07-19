package practice.authenticationandauthorization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practice.authenticationandauthorization.entity.Authority;
import practice.authenticationandauthorization.service.authorization.AuthorizationService;

@RestController
@RequestMapping("/api/auth/permissions")
public class AuthorizationController {
    @Autowired
    private AuthorizationService authorizationService;

    @GetMapping("/{username}")
    public Authority getAuthority(@PathVariable String username) {
        return authorizationService.getAuthority(username);
    }
}
