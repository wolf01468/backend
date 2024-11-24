package com.base.backend.controller;

import com.base.backend.service.DbFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    DbFieldService dbFieldService;

    @GetMapping("/test")
    public HttpEntity<Object> test() {
        return new HttpEntity<>("nvhuy10 test");
    }

    @GetMapping("/get")
    public HttpEntity<Object> getsdsd() {
        return new HttpEntity<>(dbFieldService.getAll());
    }
}
