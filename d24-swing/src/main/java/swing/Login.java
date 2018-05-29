package com.swing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * µ«¬º
 * @author boode
 *
 */
public class Login {

	private User user;
	
	public Login() {
		super();
	}

	public Login(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * —È÷§’À∫≈∫Õ√‹¬Î
	 * @return
	 */
	public boolean login(){
		
		/*try {
			FileInputStream fis = new FileInputStream(FILE_PATH);
			
			
			p.load(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		PropertiesReader reader = new PropertiesReader();
		reader.read();
		
		String username = reader.getProperty("username");
		String pwd = reader.getProperty("pwd");
		
		
		if(user.getUsername().equals(username) && user.getPwd().equals(pwd)){
			
			return true;
		}else{
			
			return false;
		}
		
		
	}
}
