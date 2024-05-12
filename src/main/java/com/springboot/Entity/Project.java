package com.springboot.Entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Project")
public class Project implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String projectName;
	private String projectManager;
	private String projectStatus;
	private Date statedDate;
	private Date endDate;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int id, String projectName, String projectManager, String projectStatus, Date statedDate,
			Date endDate) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.projectManager = projectManager;
		this.projectStatus = projectStatus;
		this.statedDate = statedDate;
		this.endDate = endDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	public String getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	public Date getStatedDate() {
		return statedDate;
	}
	public void setStatedDate(Date statedDate) {
		this.statedDate = statedDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", projectManager=" + projectManager
				+ ", projectStatus=" + projectStatus + ", statedDate=" + statedDate + ", endDate=" + endDate + "]";
	}
	
}
