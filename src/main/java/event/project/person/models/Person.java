package event.project.person.models;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;
  
  @Column(nullable = false)
  private String fullname;

  @Column(nullable = false)
  private Date bod;

  @Column(nullable = false)
  private String phoneNumber;

  @Column(nullable = true)
  private String ktp;

  private Date createdAt;

  private Date updatedAt;
}
