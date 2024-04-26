package com.drWhoAPI.drWhoAPI;

import com.drWhoAPI.drWhoAPI.models.*;
import com.drWhoAPI.drWhoAPI.models.Crew;
import com.drWhoAPI.drWhoAPI.models.enums.Format;
import com.drWhoAPI.drWhoAPI.models.enums.Series;
import com.drWhoAPI.drWhoAPI.repositories.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DrWhoApiApplicationTests {

	@Autowired
	DoctorRepository doctorRepository;

	@Autowired
	CompanionRepository companionRepository;

	@Autowired
	StoryRepository storyRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	ReviewRepository reviewRepository;

	@Autowired
	CrewRepository crewRepository;

	@Autowired
	CastRepository castRepository;

	@Autowired
	PersonRepository personRepository;

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

	@Test
	public void canSaveUser(){
		User todd = new User("todd@email.com", "hot_todd", "Nebraska", "userImgURL", "Todd is great.", "www.hottoddy.com");
		userRepository.save(todd);
	}

	@Test
	public void canSavePerson(){
		Person dnewark = new Person("Derek Newark", "Actor.");
		personRepository.save(dnewark);
	}

	@Test
	public void canSaveStory() {
		Doctor firstDoctor = new Doctor ("First Doctor", "1963 - 1966", "William Hartnell", "A cheeky wizard and cantankerous snob who learns how to become a hero.");
		Companion susan = new Companion ("Susan", "Foreman", "", "1963 - 1964", "Carole Ann Ford", "The Doctor's granddaughter, a precocious but frail teenager who dotes on her grandfather but has a burgeoning desire to settle down rather than constantly travelling.");
		Person aCoburn =  new Person("Anthony Coburn", "Writer.");
		personRepository.save(aCoburn);
		Story unearthly = new Story("An Unearthly Child", Format.TV, "23/11/63 - 14/12/63", "Novelisation(1981), VHS(1990, 2000), DVD(2006)", "img_url", "the first ever story", "totters lane, junkyard, cavemen", Series.SEASON1, "A");
		doctorRepository.save(firstDoctor);
		unearthly.addDoctor(firstDoctor);
		companionRepository.save(susan);
		unearthly.addCompanion(susan);
		storyRepository.save(unearthly);
	}

	@Test
	public void canSaveCrew(){
		Doctor firstDoctor = new Doctor ("First Doctor", "1963 - 1966", "William Hartnell", "A cheeky wizard and cantankerous snob who learns how to become a hero.");
		Companion susan = new Companion ("Susan", "Foreman", "", "1963 - 1964", "Carole Ann Ford", "The Doctor's granddaughter, a precocious but frail teenager who dotes on her grandfather but has a burgeoning desire to settle down rather than constantly travelling.");
		Person aCoburn =  new Person("Anthony Coburn", "Writer.");
		personRepository.save(aCoburn);
		Story unearthly = new Story("An Unearthly Child", Format.TV, "23/11/63 - 14/12/63", "Novelisation(1981), VHS(1990, 2000), DVD(2006)", "img_url", "the first ever story", "totters lane, junkyard, cavemen", Series.SEASON1, "A");
		doctorRepository.save(firstDoctor);
		unearthly.addDoctor(firstDoctor);
		companionRepository.save(susan);
		unearthly.addCompanion(susan);
		storyRepository.save(unearthly);
		Crew writer = new Crew(aCoburn, "Writer", unearthly);
		crewRepository.save(writer);

	}

	@Test
	public void canSaveReview(){
		Doctor firstDoctor = new Doctor ("First Doctor", "1963 - 1966", "William Hartnell", "A cheeky wizard and cantankerous snob who learns how to become a hero.");
		Companion susan = new Companion ("Susan", "Foreman", "", "1963 - 1964", "Carole Ann Ford", "The Doctor's granddaughter, a precocious but frail teenager who dotes on her grandfather but has a burgeoning desire to settle down rather than constantly travelling.");
		Story unearthly = new Story("An Unearthly Child", Format.TV, "23/11/63 - 14/12/63", "Novelisation(1981), VHS(1990, 2000), DVD(2006)", "img_url", "the first ever story", "totters lane, junkyard, cavemen", Series.SEASON1, "A");
		doctorRepository.save(firstDoctor);
		unearthly.addDoctor(firstDoctor);
		companionRepository.save(susan);
		unearthly.addCompanion(susan);
		storyRepository.save(unearthly);
		User todd = new User("todd@email.com", "hot_todd", "Nebraska", "userImgURL", "Todd is great.", "www.hottoddy.com");
		userRepository.save(todd);
		Review review = new Review(unearthly, todd, "very good", 4, false);
		reviewRepository.save(review);

	}
}
