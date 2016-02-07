package ru.yandex.android.andrew.spring_guides.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.android.andrew.spring_guides.hello.Greeting;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Andrew on 07.02.2016.
 */
@RestController
public class GreetingController {
    private static final String template = "HELLO, %s!";
    private final AtomicInteger counter = new AtomicInteger();

    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
