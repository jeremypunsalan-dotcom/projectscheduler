package com.jeremypunsalan.takehome.projectscheduler.service;


import java.util.List;

import com.jeremypunsalan.takehome.projectscheduler.builders.TaskViewBuilder;
import com.jeremypunsalan.takehome.projectscheduler.view.ProjectView;
import com.jeremypunsalan.takehome.projectscheduler.view.TaskView;

public interface TaskService {

	ProjectView calculateStartEndDates(ProjectView project) throws Exception;
	
	List<TaskView> provideTasksInChronologicalOrder(ProjectView project) throws Exception;
	
	TaskView saveTask(TaskView task) throws Exception;

	TaskView getTaskById(Integer taskId) throws Exception;
	
	TaskView getTask(TaskViewBuilder taskViewBuilder) throws Exception;

	List<TaskView> getAllTaskIdTaskName() throws Exception;

	List<Integer> getAllDependentTaskId(Integer taskId) throws Exception;
	
}
