package com.drWhoAPI.drWhoAPI.repositories;

import com.drWhoAPI.drWhoAPI.models.UserStories;
import com.drWhoAPI.drWhoAPI.models.enums.UserStoryType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserStoriesRepository extends JpaRepository<UserStories, Long> {

    List<UserStories> findByUserId(Long id);
    List<UserStories> findByUserIdAndType(Long id, UserStoryType type);
}
