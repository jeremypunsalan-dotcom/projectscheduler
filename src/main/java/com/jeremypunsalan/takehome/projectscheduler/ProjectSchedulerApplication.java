package com.jeremypunsalan.takehome.projectscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.jeremypunsalan.takehome.projectscheduler")
@SpringBootApplication
public class ProjectSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSchedulerApplication.class, args);
	}

}
