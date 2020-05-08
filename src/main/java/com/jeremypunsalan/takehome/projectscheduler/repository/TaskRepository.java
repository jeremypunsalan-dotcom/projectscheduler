package com.jeremypunsalan.takehome.projectscheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeremypunsalan.takehome.projectscheduler.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
