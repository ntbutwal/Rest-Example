package com.kkc.projectControll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kkc.dtoproject.DtoProject;
import com.kkc.projectService.ProjectService;
import com.kkc.projectService.SetProjectService;

@RestController
@RequestMapping("/project")
public class ProjectControl {
	private SetProjectService sps;

	@GetMapping(value = "/data")
	public DtoProject showdata() {
		ProjectService ps = new ProjectService();
		DtoProject dp = new DtoProject();
		ps.setdata(dp);
		return dp;

	}

	@GetMapping(value = "")
	public DtoProject senddata(@RequestParam  Integer productid) {
		return sps.getDataByDto(productid);
	}

	public SetProjectService getSps() {
		return sps;
	}

	public void setSps(SetProjectService sps) {
		this.sps = sps;
	}


}
