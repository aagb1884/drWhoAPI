package com.drWhoAPI.drWhoAPI.repositories;

import com.drWhoAPI.drWhoAPI.models.UserStories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserStoriesRepository extends JpaRepository<UserStories, Long> {
}
