package com.clinic.controller;

import org.springframework.web.bind.annotation.*;
import java.time.OffsetDateTime;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class HealthController {

    @GetMapping("/health")
    public Map<String, Object> health() {
        return Map.of(
            "success", true,
            "message", "Service is healthy",
            "data", Map.of("status", "UP"),
            "timestamp", OffsetDateTime.now().toString()
        );
    }
}