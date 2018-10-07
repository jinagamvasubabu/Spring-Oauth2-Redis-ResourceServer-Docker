package com.vasu.ResourceServer.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/secure")
public class SecuredController {

    @GetMapping("/read")
    @PreAuthorize("hasRole('ROLE_READ')")
    public ResponseEntity<String> readSomething() {
        return new ResponseEntity<>("Secure Read controller saying Hi", HttpStatus.OK);
    }

    @GetMapping("/write")
    @PreAuthorize("hasRole('ROLE_WRITE')")
    public ResponseEntity<String> writeSomething() {
        return new ResponseEntity<>("Secure Write controller saying Hi", HttpStatus.OK);
    }
}
