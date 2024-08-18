//use properties class read nad edit file from java code 
//it read,send,edit file from the java code
//firstly we have to create a file with .properties extention


import java.util.*; 
import java.io.*; // FileInputStream class

class PropertiesDemo {
	public static void main(String[] args)throws IOException {
		Properties obj = new Properties();

		FileInputStream fobj = new FileInputStream("friends.properties");

		obj.load(fobj);

		String name = obj.getProperty("Ashutosh");
		System.out.println(name);

		obj.setProperty("Akash","Solapur");

		FileOutputStream outobj = new FileOutputStream("friends.properties");

		obj.store(outobj,"Updated by Ashu");
	}
}



