package com.osber.registration.registrationform.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService service;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request) throws IllegalAccessException {
        return service.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return service.confirmToken(token);
    }
}
