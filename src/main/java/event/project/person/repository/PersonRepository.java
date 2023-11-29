package event.project.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import event.project.person.models.Person;

public interface PersonRepository extends JpaRepository<Person, String> {
  
}
