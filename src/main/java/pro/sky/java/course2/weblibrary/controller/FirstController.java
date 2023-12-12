package pro.sky.java.course2.weblibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.weblibrary.service.CounterServiceImpl;

@RestController
public class FirstController {

    private final CounterServiceImpl counterService;

    public FirstController(CounterServiceImpl counterService) {
        this.counterService = counterService;
    }

    @GetMapping
    public String showHello() {
        return "Hello Spring";
    }

    @GetMapping("/counter")
    public String showCounter() {
        return "Количество запросов " + counterService.getRequestCount();
    }

    @GetMapping("/greetings")
    public String showGreetings(@RequestParam String name, @RequestParam String lastName) {
        return "Hello, " + name + " " + lastName + "!";
    }
}
