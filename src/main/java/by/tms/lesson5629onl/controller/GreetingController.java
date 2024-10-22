package by.tms.lesson5629onl.controller;

import by.tms.lesson5629onl.model.Greeting;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author simonpirko
 * Created on 22.10.24
 */

//VM Image
//Docker Image(Dockerfile)

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public ResponseEntity<Greeting> greeting(@RequestParam(name = "name", defaultValue = "Ivan") String name) {

        String message = "Hello %s!".formatted(name);

        return ResponseEntity.ok(new Greeting(message));
    }
}
