package com.springboot.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Entity.Project;

@Repository
public interface ProjectRepoitory extends JpaRepository<Project, Integer>{

	Optional<Project> findProjectById(int id);
	Optional<Project> findProjectByProjectName(String projectName);
}
