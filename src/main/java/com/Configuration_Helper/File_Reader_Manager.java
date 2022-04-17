package com.Configuration_Helper;

import java.io.IOException;

public class File_Reader_Manager {           //for automation
	
	
	
	
	private File_Reader_Manager() {          //private constructor
		
	}
	
     public static File_Reader_Manager get_instance__FRM() {      //stattic method
    	 
    	 File_Reader_Manager frm = new File_Reader_Manager();
    	 
    	 return frm;
	
	}
	public Configuration_Reader_automation get_instance_CR() throws IOException {    // non stattic method
			
		 Configuration_Reader_automation reader = new Configuration_Reader_automation();
			
		 return reader;
			
		}
     
     
     
     
		

	}
	
	
	
	
	
	


