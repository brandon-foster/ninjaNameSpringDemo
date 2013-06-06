package demo.spring.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class NameTypeUploadModel {

	private CommonsMultipartFile file;
	
	public CommonsMultipartFile getFile() {
		return file;
	}
	
	public void setFile(CommonsMultipartFile file) {
		this.file = file;
	}
	
}
