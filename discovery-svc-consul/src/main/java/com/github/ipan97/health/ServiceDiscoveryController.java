package com.github.ipan97.health;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ipan Taupik Rahman
 */
@RestController
public class ServiceDiscoveryController {
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/my-health-check")
    public ResponseEntity<String> myCustomCheck() {
        String message = "Testing my healh check function";
        return new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
    }
}
