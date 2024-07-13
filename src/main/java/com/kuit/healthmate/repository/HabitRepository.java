package com.kuit.healthmate.repository;

import com.kuit.healthmate.domain.Habit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitRepository  extends JpaRepository<Habit, Long> {
}
