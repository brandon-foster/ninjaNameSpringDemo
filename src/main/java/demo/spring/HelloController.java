package demo.spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.spring.model.NameRequestModel;
import demo.spring.service.NameService;

@Controller
public class HelloController {

	private List<NameService> nameServices;

	@RequestMapping(value = { "", "/" }, method = RequestMethod.GET)
	public String getIndex(Model model) {
		Map<String, String> names = getSupportedNames();
		model.addAttribute("names", names);
		return "index";
	}

	@ResponseBody
	@RequestMapping(value = { "", "/" }, method = RequestMethod.POST)
	public Map<String, String> getNinjaName(NameRequestModel model) {
		
		Map<String, String> names = new HashMap<String, String>();

		NameService requestedService = getNameService(model.getNameType());
		if (requestedService == null) {
			names.put("error", "Service for provided nameType not found");
		}
		else {
			names.put("name", requestedService.getName(model.getFirstName(), 
					model.getLastName()));
		}
		
		return names;
	}
	
	private Map<String, String> getSupportedNames() {
		Map<String, String> names = new HashMap<String, String>();
		for (NameService service : nameServices) {
			names.putAll(service.getNames());
		}
		return names;
	}
	
	private NameService getNameService(String nameType) {
		for (NameService service : nameServices) {
			if (service.supports(nameType))
				return service;
		}
		return  null;
	}

	@Autowired
	public void setNameServices(List<NameService> nameServices) {
		this.nameServices = nameServices;
	}
}
