package event.project.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import event.project.users.models.User;

public interface UserRepository extends JpaRepository<User, String>{

  User findByEmail(String email);
  
}
