package in.prashant.utility;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import in.prashant.binding.Address;
import in.prashant.binding.Student;

public class MarshallDemo {

	public static void main(String[] args) throws JAXBException {
		
		Address address = new Address();
		address.setCity("Mohali");
		address.setState("Punjab");
		address.setCountry("India");
		
		Student student = new Student();
		student.setId(20152);
		student.setName("Prashant");
		student.setPhone(9999988888L);
		student.setAddress(address);
		
		JAXBContext context = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(student, new File("student.xml"));
        System.out.println("Marshalling done..");
	}

}
