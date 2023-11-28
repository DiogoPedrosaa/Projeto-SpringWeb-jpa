package com.crudspring.course.resources;

import com.crudspring.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Diogo", "Diogoemail@email", "12414-15112", "6281564");

        return ResponseEntity.ok().body(u);
    }
}
