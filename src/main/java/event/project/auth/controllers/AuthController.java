package event.project.auth.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import event.project.auth.services.AuthService;
import event.project.users.dto.UserDto;
import event.project.users.models.User;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
  @Autowired
  private AuthService authService;

  @PostMapping("/register")
  public ResponseEntity<UserDto<User>> registerUser(@Valid @RequestBody User user, Errors errors) {
    UserDto<User> userDto = new UserDto<>();

    if (errors.hasErrors()) {
      for (ObjectError error : errors.getAllErrors()) {
        userDto.getMessages().add(error.getDefaultMessage());
      }
      userDto.setStatus(false);
      userDto.setPayload(null);
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(userDto);
    }
    userDto.setStatus(true);
    userDto.setPayload(authService.register(user));
    return ResponseEntity.ok(userDto);
  } 
}
