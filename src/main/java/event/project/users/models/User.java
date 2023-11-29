package event.project.users.models;

import java.io.Serializable;

import event.project.person.models.Person;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User implements Serializable{
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

  @OneToOne
  private Person person;
}
