package com.study.limitsService.controller;

import com.study.limitsService.bean.Limits;
import com.study.limitsService.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration config;

    @GetMapping("/limits")
    public ResponseEntity<Limits> retrieveLimits() {
        return new ResponseEntity<>(new Limits(config.getMinimum(), config.getMaximum()), HttpStatus.I_AM_A_TEAPOT);
    }
}
