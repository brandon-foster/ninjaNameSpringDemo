package demo.spring.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "nameType")
public class XmlUploadModel {

	public String name;
	public String key;
	public NameTranslation firstNameTranslation;
	public NameTranslation lastNameTranslation;
	
	public String getName() {
		return name;
	}

	public String getKey() {
		return key;
	}

	public NameTranslation getFirstNameTranslation() {
		return firstNameTranslation;
	}

	public NameTranslation getLastNameTranslation() {
		return lastNameTranslation;
	}

	@XmlRootElement(name = "nameTranslation")
	public static class NameTranslation {
		public int maxChars;
		public int offset;
		
		@XmlElementWrapper(name = "elements")
		@XmlElement(name = "element")
		public List<NameElements> elements;
		
		public int getMaxChars() {
			return maxChars;
		}
		
		public int getOffset() {
			return offset;
		}
		
		public List<NameElements> getElements() {
			return elements;
		}
		
	}
	
	@XmlRootElement(name = "element")
	public static class NameElements {
		@XmlAttribute(name = "letter")
		public String letter;
		
		@XmlValue
		public String sound;

		public String getLetter() {
			return letter;
		}

		public String getSound() {
			return sound;
		}
		
	}
	
}
