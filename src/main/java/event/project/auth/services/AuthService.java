package event.project.auth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import event.project.users.models.User;
import event.project.users.repository.UserRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class AuthService {
  @Autowired
  private UserRepository userRepository;

  public User register(User user) {
    return userRepository.save(user);
  }
}
