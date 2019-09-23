package com.gymroutine.backend.entrypoint;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dummy")
@Api(tags = "Dummy API", description = "This API has operations related to Dummy Controller")
public class DummyController {

    @GetMapping("/hi")
    @ApiOperation("Dummy Operations")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request") })
    public String index() {
        return "Greetings!";
    }

}
