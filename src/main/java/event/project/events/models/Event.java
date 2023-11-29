package event.project.events.models;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "events")
public class Event implements Serializable{
  
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;

  @Column(length = 100, nullable = false)
  private String name;

  @Column(length = 200, nullable = false)
  private String address;

  @Column(nullable = false)
  private int price;
}
