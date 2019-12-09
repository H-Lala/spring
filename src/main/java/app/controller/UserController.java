package app.controller;

import app.Service.UserService;
import app.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Collection;

@RestController
public class UserController {
    private  UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/")
    public Collection<Person> btdf() {
        return userService.getAll();
    }
    @GetMapping("/users/{id}")
    public Person getOne(@PathVariable ("id") int id) {
        return  userService.get(id);
    }
    @GetMapping("/user/add/{name}")
    public Person getName(@PathVariable ("name") String name) {
        return  userService.create(name);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/user/add2/")
    public Person getName2(@PathParam("name") String name) {
        return  userService.create(name);
    }



}
