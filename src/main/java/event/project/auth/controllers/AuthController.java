package event.project.auth.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import event.project.auth.services.AuthService;
import event.project.users.models.User;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
  @Autowired
  private AuthService authService;

  @PostMapping("/register")
  public User registerUser(@Valid @RequestBody User user, Errors errors) {
    if (errors.hasErrors()) {
      for (ObjectError error : errors.getAllErrors()) {
        System.err.println(error);
      }
      throw new RuntimeException("Validation Error");
    }
    return authService.register(user);
  } 
}
