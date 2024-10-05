package dev.antonstihl.try_jte.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;

@RestController
public class NumberController {

    private static final SecureRandom secureRandom = new SecureRandom();

    @GetMapping("/random-number")
    public int randomNumber() {
        return secureRandom.nextInt(100);
    }
}
