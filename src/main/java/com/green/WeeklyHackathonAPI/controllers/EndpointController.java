package com.green.WeeklyHackathonAPI.controllers;

import com.green.WeeklyHackathonAPI.SupportingDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EndpointController {

    @GetMapping("/test")
    public ResponseEntity<String> returnString() {
        return ResponseEntity.ok(SupportingDataService.returnString());
    }
}
