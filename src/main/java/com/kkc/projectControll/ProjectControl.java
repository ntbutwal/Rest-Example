package com.kkc.projectControll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kkc.dtoproject.DtoProject;
import com.kkc.projectService.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectControl {
	@GetMapping(value="/data")
	public DtoProject showdata() {
		ProjectService ps= new ProjectService();
		DtoProject dp= new DtoProject();
		ps.setdata(dp);
		return dp;
		
	}
	

}
