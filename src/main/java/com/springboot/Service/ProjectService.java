package com.springboot.Service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Entity.Project;
import com.springboot.Exception.ProjectNotFoundException;
import com.springboot.Repository.ProjectRepoitory;

@Service
public class ProjectService {

	@Autowired
	private  ProjectRepoitory projectRepoitory;
	
	public Project addProject(Project project) {
		return projectRepoitory.save(project);
	}
	
	public List<Project> getAllProject(){
		return projectRepoitory.findAll();
	}
	
	//Find Project Details By Id
	public Project getProjectById(int id) {
		return projectRepoitory.findProjectById(id)
				.orElseThrow(() -> new ProjectNotFoundException("Project with id "+id+" not found"));
	}
	
	//Find Project Details By Project Name
	public Project getProjectByName(String projectName) {
		return projectRepoitory.findProjectByProjectName(projectName)
				.orElseThrow(() -> new ProjectNotFoundException("Project with name "+projectName+" not found"));
	}
	
	//Update Project By Id
	public Project updateProject(Project project) {
		return projectRepoitory.save(project);
	}
	
	//Delete Project By Id
	public void deleteProject(int id) {
		Project getProject = projectRepoitory.findById(id)
				.orElseThrow(() -> new ProjectNotFoundException("Project with Id "+id+" not found"));
		projectRepoitory.delete(getProject);
		
	}
	
	
}
