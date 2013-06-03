package demo.spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.spring.service.NinjaNameService;

@Controller
public class HelloController {

	private NinjaNameService ninjaNameService;

	@RequestMapping(value = { "", "/" }, method = RequestMethod.GET)
	public String getIndex() {
		System.out.println("HI THERE");
		return "index";
	}

	@ResponseBody
	@RequestMapping(value = { "", "/" }, method = RequestMethod.POST)
	public Map<String, String> getNinjaName(
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName) {
		Map<String, String> names = new HashMap<String, String>();
		names.put("name", ninjaNameService.getNinjaName(firstName, lastName));
		return names;
	}

	@Autowired
	public void setNinjaNameService(NinjaNameService ninjaNameService) {
		this.ninjaNameService = ninjaNameService;
	}
}
