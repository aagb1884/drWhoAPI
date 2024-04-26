package com.drWhoAPI.drWhoAPI.repositories;

import com.drWhoAPI.drWhoAPI.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
