package data.gt.service;

import data.gt.Dto.UserDto;
import data.gt.Entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import data.gt.repository.UserRepository;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public User save(UserDto userDto) {
        User user = new User(userDto);
        return userRepository.save(user);
    }
}
