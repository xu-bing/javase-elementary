package com.swing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	private Properties p = new Properties();
	
	private static final String FILE_PATH = "c:\\login.properties";
		
	public void read(){
		
		
		try {
			FileInputStream fis = new FileInputStream(FILE_PATH);
			
			
			p.load(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public Properties getP(){
		
		return p;
	}
	
	public String getProperty(String key){
		
		return p.getProperty(key);
	}
}
