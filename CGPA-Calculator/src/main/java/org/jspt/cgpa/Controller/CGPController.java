package org.jspt.cgpa.Controller;

import org.jspt.cgpa.Dto.Cgpa;
import org.jspt.cgpa.Dto.Percentage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cgpa")
public class CGPController {
	
	private String HOME = "home";
	
	private String FORM = "showForm";
	
	private String RESULT = "showResult";

	@RequestMapping("/home")
	public String home()
	{
		return HOME;
	}
	
	@RequestMapping("/showForm")
	public String calculator(Model themodel)
	{
		Cgpa cgpa = new Cgpa();
		themodel.addAttribute("cgpa", cgpa);
		return FORM;
	}
	
	@RequestMapping("/calculate")
	public String calculate(@ModelAttribute("cgpa") Cgpa thecgpa,Model theModel)
	{
	int TotalCgpa = (thecgpa.getSubject1()+thecgpa.getSubject2()+thecgpa.getSubject3()+thecgpa.getSubject4())/4;
	theModel.addAttribute("cgpa", TotalCgpa);
	return RESULT;
	}
	
	@RequestMapping("/showPercentage")
	public String calculatePercentage(Model theModel)
	{
		Percentage pt = new Percentage();
		
		theModel.addAttribute("percentage", pt);
		
		return "showPercentage";
	}
	
	@RequestMapping("/calculatePercentage")
	public String calculatePercentage(@RequestParam(name = "percent") Double percent,
			Model theModel)
	{
		Double percentage = (percent-0.75)*10;
		
		theModel.addAttribute("percentage", percentage);
		
		return "ResultPage";
		
		
	}
}
