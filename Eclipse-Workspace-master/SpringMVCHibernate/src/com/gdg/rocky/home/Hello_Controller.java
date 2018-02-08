package com.gdg.rocky.home;

import javax.xml.ws.RequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello_Controller {
	
	@RequestMapping(value = "/welcome")
	public ModelAndView helloWorld()
	{
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "hello world");
		return model;
	}

}
