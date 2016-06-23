package by.epamlab.utils.xml.builders;

import by.epamlab.beans.ReservationType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
public class ReservationBuilder {
	private static final String FILE_NAME = "c:/0004257753-full.xml";
	
	public static void objectToXML(ReservationType reservationType) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ReservationType.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			StringWriter sw = new StringWriter();
			jaxbMarshaller.marshal(reservationType, sw);
			String xmlString = sw.toString();
			FileWriter writer = null;
			try {
				writer = new FileWriter(FILE_NAME);
				writer.write(xmlString);
				writer.flush();
			}catch(IOException ex){
				ex.printStackTrace();
			}finally {
				if (writer != null) {
					try {
						writer.close();
					}catch (IOException err) {
						err.printStackTrace();
					}
				}
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
	
	public static ReservationType xmlToObject() {
		ReservationType reservationType = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ReservationType.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			reservationType = (ReservationType)jaxbUnmarshaller.unmarshal(new File(FILE_NAME));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return reservationType;
	}

}
