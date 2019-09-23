package com.gymroutine.backend.entrypoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dummy")
public class DummyController {

    @RequestMapping("/hi")
    public String index() {
        return "Greetings!";
    }

}
