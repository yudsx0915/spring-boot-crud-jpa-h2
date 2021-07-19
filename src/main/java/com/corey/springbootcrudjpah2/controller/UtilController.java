package com.corey.springbootcrudjpah2.controller;

import com.corey.springbootcrudjpah2.service.UtilService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/util", produces = "application/json")
public class UtilController {
    
    @Autowired
    UtilService utilService;

    @GetMapping("/getAddString")
    public String addString(@RequestParam String a, @RequestParam String b) {
        return utilService.addString(a, b);
    }
}
