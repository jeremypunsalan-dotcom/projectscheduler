package com.jeremypunsalan.takehome.projectscheduler.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeremypunsalan.takehome.projectscheduler.entities.ProjectTasks;

public interface ProjectTasksRepository extends JpaRepository<ProjectTasks, Integer> {
	
	public List<ProjectTasks> findByProjectId(Integer projectId);

}
