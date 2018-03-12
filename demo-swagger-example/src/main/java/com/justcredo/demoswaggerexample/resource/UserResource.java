package com.justcredo.demoswaggerexample.resource;

import com.justcredo.demoswaggerexample.model.User;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/rest/user")
@RestController
public class UserResource {
    @GetMapping
    public List<User> getUsers() {

        return Arrays.asList(
                new User("Sam", 2000L),
                new User("Peter", 1000L)
        );
    }

    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") final String userName)
    {
        return new User(userName, 1000L);
    }

    @PostMapping
    public User saveUser(@RequestBody final User user)
    {
        return user;
    }


}
