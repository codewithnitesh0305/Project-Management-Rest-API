package com.springboot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Entity.Project;
import com.springboot.Service.ProjectService;

@RestController
@RequestMapping("/api")
public class HomeController {

	private ProjectService projectService;
	public HomeController(ProjectService projectService) {
		super();
		this.projectService = projectService;
	}
	//Add Project
	@PostMapping("/project")
	public ResponseEntity<Project> addProject(@RequestBody Project project){
		Project newProject = projectService.addProject(project);
		return new ResponseEntity<Project>(newProject,HttpStatus.CREATED);
	}
	
	//Retrieve All Project
	@GetMapping("/project")
	public ResponseEntity<List<Project>> getAllProject(){
		List<Project> project = projectService.getAllProject();
		if(project != null) {
			return new ResponseEntity<List<Project>>(project,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<Project>>(project,HttpStatus.NOT_FOUND);
		}		
	}
	//Find Project By Project Name
	@GetMapping("/project/name/{projectname}")
	public ResponseEntity<Project> getProjectByName(@PathVariable("projectname") String projectname){
		Project project = projectService.getProjectByName(projectname);
		return new ResponseEntity<Project>(project,HttpStatus.FOUND);
	}
	
	//Find Project By Id
	@GetMapping("/project/{id}")
	public ResponseEntity<Project> getProjectById(@PathVariable("id") int id){
		Project project = projectService.getProjectById(id);
		return new ResponseEntity<Project>(project,HttpStatus.FOUND);
	}
	
	//Update Project By Id
	@PutMapping("/project/{id}")
	public ResponseEntity<Project> updateProject(@PathVariable("id") int id, @RequestBody Project project){
		project.setId(id);
		Project updateProject = projectService.updateProject(project);
		return new ResponseEntity<Project>(updateProject,HttpStatus.OK);
	}
	
	//Update Project By Project Name
	//Note :- This will insert new data while update of data
	@PutMapping("/project/name/{projectname}")
	public ResponseEntity<Project> updateProjectByName(@PathVariable("projectname") String projectname, @RequestBody Project project){
		project.setProjectName(projectname);
		Project updateProject = projectService.updateProject(project);
		return new ResponseEntity<Project>(updateProject,HttpStatus.OK);
	}
}
