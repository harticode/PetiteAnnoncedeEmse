package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.api;


import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dao.UserDao;
import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dto.UserDto;
import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.User;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController // RestController is a Spring stereotype to mark a class as a rest service
@RequestMapping("/api/users") // @RequestMapping is used to define a global URL prefix used to manage a resource (in our example all requests that start with /api/windows will be handle by this controller)
@Transactional
public class UserController {
    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @PostMapping
    public UserDto create(@RequestBody UserDto dto){
        User user = null;
        user = userDao.save(new User(dto.getEmail(), dto.getUsername(), dto.getPhotoUrl()));
        return new UserDto(user);
    }

    @GetMapping(path = "/{email}")
    public User findUserByEmail(@PathVariable String email){
        return userDao.findUserByEmail(email);
    }
}
