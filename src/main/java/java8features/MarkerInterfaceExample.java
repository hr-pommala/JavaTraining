package java8features;

import java.io.*;

public class MarkerInterfaceExample {
    
	public static void main(String[] args) {
        
		Person person = new Person("John", 30, 01);
        
        // Check if the object is serializable
        if (person instanceof SerializableMarker) {
            try {
                // Serialize the object
                FileOutputStream fileOut = new FileOutputStream("person.txt");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(person);
                out.close();
                fileOut.close();
                System.out.println("Serialized data is saved in person.ser");
            } catch (IOException i) {
                i.printStackTrace();
            }
        } else {
            System.out.println("The object is not serializable.");
        }
    }
} 

//read an object from file using FILE IO
 