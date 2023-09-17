package run.itlife.mediaapp.controllers.api.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestApp {
    @Value("${spring.application.name}")
    private String name;

    @GetMapping
    public String getNameApplication() {
        return name;
    }

    @GetMapping("/springboot")
    public String welcome() {
        return "<h1>Spring Boot</h1>";
    }
}
