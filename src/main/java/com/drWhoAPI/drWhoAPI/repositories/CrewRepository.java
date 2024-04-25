package com.drWhoAPI.drWhoAPI.repositories;

import com.drWhoAPI.drWhoAPI.models.enums.Crew;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrewRepository extends JpaRepository<Crew, Long> {
}
