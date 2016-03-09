package ch.cern.dam.cep;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("/string/")
	public String returningString(@RequestParam(value = "name", required = false, defaultValue = "Ann") String name,
			Model model) {
		model.addAttribute("name", name);
		System.out.println("I'm alive and returning a string!");
		return "welcome";
	}
	
	@RequestMapping("/array/")
	public String testArray(Model model) {
		System.out.println("I'm creating an array!");
		model.addAttribute("testArr", new String[] {"abc","cde"});
		return "testArray";
	}
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		String message = "I'm a simple message!";
		return new ModelAndView("welcome", "message", message);
	}
}