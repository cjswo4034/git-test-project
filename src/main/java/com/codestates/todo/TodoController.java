package com.codestates.todo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TodoController {
    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("To-do Application!");
    }
}
