package com.pablo.booking_system;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class HealthController {
    @RequestMapping("/health")
    public String checkAPI() {
        return "<h1>The API is working ok!</h1>";
    }
}
