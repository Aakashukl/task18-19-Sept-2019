package com.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.main.Entity.Student;
import com.main.Service.StudentService;

@Controller
public class MainController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("EntryData")
	public ModelAndView studentEntry(@ModelAttribute("EntryData") Student student) {
		studentService.studentEntry(student);
		
		ModelAndView modelAndView = new ModelAndView("Result");
		return modelAndView;
	}
	
	@RequestMapping("EntryDelete")
	public ModelAndView studentDelete(@RequestParam("rno") int rno) {
		Student student = studentService.studentSearch(rno);
		if(student !=null)
		{
			studentService.studentDelete(rno);
			ModelAndView modelAndView = new ModelAndView("Result");
			modelAndView.addObject("EntryData", student);
			return modelAndView;
		}
		else
		{
			ModelAndView modelAndView = new ModelAndView("Result");
			modelAndView.addObject("EntryData", student);
			return modelAndView;
		}
			
	}
	
	@RequestMapping("EntryUpdate")
	public ModelAndView studentUpdate(@ModelAttribute("EntryData") Student student) {
		studentService.studentUpdate(student);
		ModelAndView modelAndView = new ModelAndView("Result");
		return modelAndView;
	}
	
	@RequestMapping("EntryUpdateCheck")
	public String studentUpdateCheck(@RequestParam("rno") int rno) {
		Student student = studentService.studentSearch(rno);
		if(student !=null) {
			return "EntryUpdate";
		}
		else
			return null;
	}

}
