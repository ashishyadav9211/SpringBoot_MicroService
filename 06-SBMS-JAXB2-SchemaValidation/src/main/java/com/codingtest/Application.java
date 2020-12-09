package com.codingtest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.joda.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.SAXException;

import com.codingtest.errorhandler.CustomValidationErrorHandler;
import com.codingtest.model.Student;
import com.codingtest.model.University;

/**
 * 
 * @author Ashish
 * 
 *         This post shown how JAXB2 Schema validation can be used in your
 *         project, validating the generated XML against specific XML Schema
 *         Definition [XSD].
 * 
 */
@SpringBootApplication
public class Application {
	private static final String XML_FILE = "education_centers.xml";

	public static void main(String[] args) throws SAXException, JAXBException, IOException {
		SpringApplication.run(Application.class, args);
		Application schemaValidation = new Application();

		List<Student> students = new ArrayList<Student>();

		Student s1 = new Student();
		s1.setId(1);
		s1.setFirstName("Alan");
		s1.setLastName("Turing");
		s1.setSection("Commerce");
		s1.setDob(new LocalDate(1956, 10, 1));
		students.add(s1);

		Student s2 = new Student();
		s2.setId(2);
		s2.setFirstName("Thomas");
		s2.setLastName("Edison");
		s2.setSection("Artio");
		s2.setDob(new LocalDate(1916, 3, 3));
		students.add(s2);

		Student s3 = new Student();
		s3.setId(3);
		s3.setFirstName("Linus");
		s3.setLastName("Torvald");
		s3.setSection("Computer Science");
		s3.setDob(new LocalDate(1958, 11, 4));
		students.add(s3);

		University university = new University();
		university.setName("Cambridge");
		university.setAddress("England");
		university.setStudents(students);

		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = sf.newSchema(schemaValidation.getSchemaFile());

		// create JAXB context
		JAXBContext context = JAXBContext.newInstance(University.class);

		System.out.println("<!----------Generating the XML Output-------------->");
		// Instantiate marshaller via context
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.setSchema(schema);

		// Write to System.out
		m.marshal(university, System.out);
		m.marshal(university, new File(XML_FILE));

		System.out.println("<!---------------Generating the Java objects from XML Input-------------->");
		// Instantiate Unmarshaller via context
		Unmarshaller um = context.createUnmarshaller();
		University unif = (University) um.unmarshal(new FileReader(XML_FILE));
		List<Student> studentsList = unif.getStudents();
		for (Student s : studentsList) {
			System.out.println("Student : " + s);
		}

//		 JAXBSource source = new JAXBSource(context, university);
//		 Validator validator = schema.newValidator();
//		 validator.setErrorHandler(new CustomValidationErrorHandler());
//		 validator.validate(source);

	}

	private File getSchemaFile() {
		// Get file from resources folder
		ClassLoader classLoader = getClass().getClassLoader();
		File schemaFile = new File(classLoader.getResource("edu.xsd").getFile());
		return schemaFile;
	}
}
