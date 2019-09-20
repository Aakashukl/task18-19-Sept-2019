package com.main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("dataEntry")
	public String dataEntry() {
		return "dataentry";
	}
	
	@RequestMapping("dataDelete")
	public String dataDelete() {
		return "EntryDelete";
	}
	
	@RequestMapping("dataUpdate")
	public String dataUpdate() {
		return "EntryUpdateCheck";
	}
	
}
