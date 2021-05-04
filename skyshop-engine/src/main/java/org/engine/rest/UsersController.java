package org.engine.rest;

import org.engine.clients.EmailClient;
import org.engine.clients.RegisterUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/users")
public class UsersController {

    private EmailClient emailClient;

    @Autowired
    public UsersController(EmailClient emailClient){
        this.emailClient = emailClient;
    }

    @PostMapping("/dummy")
    public ResponseEntity<?> test() {

        RegisterUserDTO obj = new RegisterUserDTO();
        obj.setId(12);

        emailClient.setUserRegistration(obj);

        return ok().build();
    }
}
