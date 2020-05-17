DROP TABLE IF EXISTS project_task;
CREATE TABLE project_task (
  project_id int DEFAULT NULL,
  task_id int DEFAULT NULL
);

DROP TABLE IF EXISTS schedule_project;
CREATE TABLE schedule_project (
  project_id int NOT NULL AUTO_INCREMENT,
  project_name varchar(255) NOT NULL,
  project_desc varchar(255) DEFAULT NULL,
  project_startdate date NOT NULL,
  PRIMARY KEY (project_id),
  UNIQUE KEY idproject_UNIQUE (project_id)
);

INSERT INTO schedule_project VALUES 
(1,'First Project','1st Project','2020-04-25'),
(2,'Second Project','2nd Project','2020-05-02'),
(3,'Third Project','3rd Project','2020-04-30');


DROP TABLE IF EXISTS schedule_task;
CREATE TABLE schedule_task (
  task_id int NOT NULL AUTO_INCREMENT,
  task_name varchar(255) NOT NULL,
  task_desc varchar(255) DEFAULT NULL,
  task_duration int NOT NULL,
  PRIMARY KEY (task_id),
  UNIQUE KEY id_UNIQUE (task_id)
);

INSERT INTO schedule_task VALUES 
(1,'First Sample Task','First task - dependent on 2nd task',10),
(2,'Second Sample Task','2nd Task - no dependent tasks',3),
(3,'Third Sample Task','3rd Task - Dependent on first task',11),
(4,'Fourth Sample Task','4th Task - Dependent on 1st and 2nd Tasks',15),
(5,'Fifth Sample Task','5th Task - Dependent of 1st and 3rd Task',2),
(6,'Sixth Sample Task','6th Task - no dependents',20);

DROP TABLE IF EXISTS task_dependencies;
CREATE TABLE task_dependencies (
  main_task_id int DEFAULT NULL,
  dependent_task_id int DEFAULT NULL
);

COMMIT;