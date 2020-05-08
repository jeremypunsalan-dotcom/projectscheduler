package com.jeremypunsalan.takehome.projectscheduler.service;

import java.util.List;

import com.jeremypunsalan.takehome.projectscheduler.entities.ProjectTasks;
import com.jeremypunsalan.takehome.projectscheduler.view.ProjectView;

public interface ProjectService {
	
	ProjectView save(final ProjectView projectView) throws Exception;
	
	ProjectView getProjectById(final Integer projectId) throws Exception;

	List<ProjectTasks> getProjectTasksByProjectId(Integer projectId) throws Exception;
	
	List<ProjectView> getAllProjects() throws Exception;

	List<ProjectView> getAllProjectsWithTasks() throws Exception;

}
