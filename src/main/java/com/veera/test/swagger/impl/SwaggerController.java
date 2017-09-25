package com.veera.test.swagger.impl;

import com.veera.test.swagger.impl.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Veeramani Bagavathi
 * on 9/11/2017.
 */
@Api(value = "User API", description = "user api for user related operations")
@RestController
@RequestMapping(value = "user")
public class SwaggerController {

    @Autowired
    private SwaggerService swaggerService;

    @GetMapping(value = "/hello")
    @ApiOperation(value = "hello", notes = "Say hello to the provided user name")
    public String sayHello(String name) {
        return swaggerService.testhello(name);
    }

    @GetMapping(value = "/gm")
    @ApiOperation("Say good morning to the provided user name")
    public String sayGm(String name) {
        return "Good Morning " + name + "...!!!";
    }

    @PostMapping(value = "/")
    @ApiOperation(value = "crete new user using post method.", notes = "added notes: user object has Address info.")
    public void postUser(@ApiParam(value = "the user information.") @RequestBody User user) {
        System.out.print("user created=" + user.getFirstName());
    }
}
