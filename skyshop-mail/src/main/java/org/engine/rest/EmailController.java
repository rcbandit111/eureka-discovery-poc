package org.engine.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    @PostMapping("/register")
    public ResponseEntity<?> register(RegisterUserDTO registerUserDTO) {

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
