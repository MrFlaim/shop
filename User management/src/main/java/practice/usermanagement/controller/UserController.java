package practice.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import practice.usermanagement.dto.FullUser;
import practice.usermanagement.service.UserService;

@Controller
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("")
    public void addUser(@RequestBody FullUser fullUser) {
        userService.addUser(fullUser);
    }

    @GetMapping("/{username}")
    public FullUser getUser(@PathVariable String username) {
        return userService.getUser(username);
    }

    @PutMapping("")
    public void updateUser(@RequestBody FullUser fullUser) {
        userService.updateUser(fullUser);
    }

    @DeleteMapping("/{username}")
    public void deleteUser(@PathVariable String username) {
        userService.deleteUser(username);
    }
}
