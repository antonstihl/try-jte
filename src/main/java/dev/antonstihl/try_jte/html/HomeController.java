package dev.antonstihl.try_jte.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.SecureRandom;

@Controller
public class HomeController {

    private static final SecureRandom secureRandom = new SecureRandom();

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/random-number")
    public String randomNumber(Model model) {
        model.addAttribute("number", secureRandom.nextInt(100));
        return "random-number";
    }
}
