package in.prashant.utility;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import in.prashant.binding.Student;

public class UnMarshallingDemo {

	public static void main(String[] args)throws Exception {
		
		JAXBContext context = JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Student student = (Student) unmarshaller.unmarshal(new File("student.xml"));
		System.out.println(student);
	}
}
