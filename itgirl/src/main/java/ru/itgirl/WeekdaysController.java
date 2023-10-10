package ru.itgirl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeekdaysController {
    @GetMapping("/hello")
public String hello(@RequestParam(value = "day", defaultValue = "День") String day) {
    return String.format("Сегодня %s!", day);
}
}
