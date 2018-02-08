package com.gdg.rocky.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gdg.rocky.pojo.OrchardMindPojo;
import com.gdg.rocky.services.OrchardMindService;

@Controller
public class OrchardMindController {

	@Autowired
	private OrchardMindService oms;
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public String setupForm(Map<String, Object> map)
	{
		OrchardMindPojo o = new OrchardMindPojo();
		map.put("OrchardMinds", o);
		map.put("OrchardMinds", oms.getAllStudent());
		return "OrchardMinds";
	}
	
	@RequestMapping(value="/OrchardMinds.do", method=RequestMethod.GET)
	public String doActions(@ModelAttribute OrchardMindPojo minds, BindingResult result, @RequestParam String action, Map<String, Object> map)
	{
		OrchardMindPojo campus = new OrchardMindPojo();
		switch(action.toLowerCase())
		{
			case "insert":
				oms.insert(minds);
				campus = minds;
				break;
			case "update":
				oms.update(minds);
				campus = minds;
				break;
			case "delete":
				oms.delete(minds.getMid());
				campus = new OrchardMindPojo();
				break;
			case "search":
				OrchardMindPojo o = oms.getStudent(minds.getMid());
				campus = o != null ? o : new OrchardMindPojo();
				break;
		}
		map.put("orchardminds", campus);
		map.put("orchardmindlist", oms.getAllStudent());
		return "OrchardMinds";
	}
	
}
