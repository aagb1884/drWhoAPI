package com.drWhoAPI.drWhoAPI;

import com.drWhoAPI.drWhoAPI.models.Companion;
import com.drWhoAPI.drWhoAPI.models.Doctor;
import com.drWhoAPI.drWhoAPI.repositories.CompanionRepository;
import com.drWhoAPI.drWhoAPI.repositories.DoctorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DrWhoApiApplicationTests {

	@Autowired
	DoctorRepository doctorRepository;

	@Autowired
	CompanionRepository companionRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canSaveDoctor() {
		Doctor firstDoctor = new Doctor ("First Doctor", "1963 - 1966", "William Hartnell", "A cheeky wizard and cantankerous snob who learns how to become a hero.");
		doctorRepository.save(firstDoctor);
	}

	@Test
	public void canSaveCompanion() {
		Companion susan = new Companion ("Susan", "Foreman", "", "1963 - 1964", "Carole Ann Ford", "The Doctor's granddaughter, a precocious but frail teenager who dotes on her grandfather but has a burgeoning desire to settle down rather than constantly travelling.");
		companionRepository.save(susan);
	}
}
