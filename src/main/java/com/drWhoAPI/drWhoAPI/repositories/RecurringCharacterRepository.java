package com.drWhoAPI.drWhoAPI.repositories;

import com.drWhoAPI.drWhoAPI.models.RecurringCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecurringCharacterRepository extends JpaRepository<RecurringCharacter, Long> {
}
