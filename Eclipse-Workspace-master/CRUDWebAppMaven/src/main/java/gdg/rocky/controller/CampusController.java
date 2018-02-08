package gdg.rocky.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gdg.rocky.pojo.CampusPojo;
import gdg.rocky.service.CampusService;

@Controller
public class CampusController{
	@Autowired
	private CampusService campusService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String,Object> map)
	{
		CampusPojo campus = new CampusPojo();
		map.put("campus", campus);
		map.put("campusList", campusService.getAllCampus());
		return "campus";
	}
	
	
	@RequestMapping(value="/CampusPojo.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute CampusPojo campus, BindingResult result, @RequestParam String action, Map<String,Object> map)
	{
		CampusPojo campusResult = new CampusPojo();
		switch (action.toLowerCase()) 
		{
			case "add":
				campusService.add(campus);
				campusResult = campus;
				break;
			case "edit":
				campusService.edit(campus);
				campusResult = new CampusPojo();
				break;
			case "delete":
				campusService.delete(campus.getMid());
				campusResult = campus;
				break;
			case "search":
				CampusPojo searchedCampus = campusService.getCampus(campus.getMid()	);
				campusResult = searchedCampus!=null ? searchedCampus : new CampusPojo();
				break;
		}
		
		map.put("campus", campusResult);
		map.put("campusList", campusService.getAllCampus());
		return "campus";
	}
	
	@RequestMapping(value="/index")
	public String ABC(ModelMap m){
		return "campus";
		
		
	}
}

