package practicesddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Sampletesting {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\commondatass.properties");
	Properties pobj= new Properties();
	pobj.load(fis);
	System.out.println(pobj.getProperty("browser"));
	System.out.println(pobj.getProperty("url"));
	String k=pobj.getProperty("password");
	System.out.println(k);
	System.out.println(pobj.getProperty("username")); 
	
}
}
