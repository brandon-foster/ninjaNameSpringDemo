package demo.spring;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.spring.model.NameTypeUploadModel;
import demo.spring.model.XmlUploadModel;

@Controller
@RequestMapping("/upload")
public class FileUploadController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getUploadForm() {
		return "nameUpload";
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String handleUpload(NameTypeUploadModel uploadModel,
			Model model) throws Exception {
		
		JAXBContext context = JAXBContext.newInstance(XmlUploadModel.class);
		Unmarshaller um = context.createUnmarshaller();
		XmlUploadModel nameModel = (XmlUploadModel) 
				um.unmarshal(uploadModel.getFile().getInputStream());
		System.out.println(nameModel.firstNameTranslation.maxChars);
		model.addAttribute("uploadedModel", nameModel);
		return "nameUploadSuccess";
	}
}
