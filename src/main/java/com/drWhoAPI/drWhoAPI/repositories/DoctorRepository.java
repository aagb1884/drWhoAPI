package com.drWhoAPI.drWhoAPI.repositories;

import com.drWhoAPI.drWhoAPI.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
