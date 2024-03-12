package data.gt.controller;

import data.gt.Dto.UserDto;
import data.gt.Entity.User;
import data.gt.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import data.gt.service.UserService;

import java.util.Optional;


@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;
    @PostMapping("/user/create")
    public ResponseEntity<User> createUser(@RequestBody UserDto userDto){
        User user = userService.save(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping("/user/create")
    public ResponseEntity<User> getUser(Long userId){
        Optional<User> optionalUser= userRepository.findById(userId);
        return ResponseEntity.status(HttpStatus.CREATED).body(optionalUser.get());
    }
    @GetMapping("/user")
    public Optional<User> check(Long id){
        Optional<User> byId =userRepository.findById(id);
        return byId;
    }
//    @GetMapping("/user")
//    public Optional<User> check(Long id){
//        Optional<User> byId =userRepository.findById(id);
//        return byId;
//    }
}

