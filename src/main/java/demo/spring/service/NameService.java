package demo.spring.service;

import java.util.Map;

public interface NameService {

	Map<String, String> getNames();
	
	boolean supports(String nameType);
	
	String getName(String firstName, String lastName);
	
}
