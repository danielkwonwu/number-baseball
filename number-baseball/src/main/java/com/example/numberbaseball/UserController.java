package com.example.numberbaseball;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/user")
    public User userOnboarding (@RequestParam(value = "username", defaultValue = "user") String username, @RequestParam (value = "password" , defaultValue = "pw") String password){
        return new User(counter.incrementAndGet(), username, password);
    }
}
