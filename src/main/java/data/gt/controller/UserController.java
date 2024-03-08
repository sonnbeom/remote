package data.gt.controller;

import data.gt.Dto.UserDto;
import data.gt.Entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import data.gt.service.UserService;


@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;
    @PostMapping("/user/create")
    public ResponseEntity<User> createUser(@RequestBody UserDto userDto){
        User user = userService.save(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
    @GetMapping("/user")
    public String check(){
        return "hello";
    }
}

