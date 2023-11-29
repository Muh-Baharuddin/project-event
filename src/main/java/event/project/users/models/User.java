package event.project.users.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;
  
  @Email(message = "invalid email format")
  @NotEmpty(message = "email is required")
  private String email;

  @NotEmpty(message = "username is required")
  private String username;

  @NotEmpty(message = "password is required")
  private String password;
}
