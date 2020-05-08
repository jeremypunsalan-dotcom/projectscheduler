package com.jeremypunsalan.takehome.projectscheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeremypunsalan.takehome.projectscheduler.entities.Project;


public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
