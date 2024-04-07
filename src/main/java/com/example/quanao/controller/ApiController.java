package com.example.quanao.controller;

import com.example.quanao.model.response.AdminResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/admin")
    public ResponseEntity<?> admin(){
        AdminResponse response = new AdminResponse();
        response.setUsername("admin@gmail.com");
        response.setPassword("12345");
        return ResponseEntity.ok(response);
    }
}
