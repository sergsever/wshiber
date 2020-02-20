package com.lvov.home;

import java.security.Principal;

import com.lvov.data.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class HomeController {

	private EmployeeDAO Dao;
	@Autowired
	public void setDao(EmployeeDAO dao)
	{
		Dao = dao;
	}

	@ModelAttribute("module")
	String module() {
		return "home";
	}

	@GetMapping("/")
	String index(Principal principal, Model model) {
		return "home/index";
	}
}
