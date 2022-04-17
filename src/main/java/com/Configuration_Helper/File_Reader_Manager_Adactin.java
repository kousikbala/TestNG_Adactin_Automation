package com.Configuration_Helper;

import java.io.IOException;

public class File_Reader_Manager_Adactin {
	
	private File_Reader_Manager_Adactin() {                                              //private constractor
		
	}
	
        public static File_Reader_Manager_Adactin get_instance_FRM() {                    //static method
        	
        	File_Reader_Manager_Adactin frm = new File_Reader_Manager_Adactin();
        	
        	return frm;
		}
        
        public Configuration_Reader_Adactin get_instance_CR() throws IOException {         //non static method
        	
        	Configuration_Reader_Adactin reader = new Configuration_Reader_Adactin();
        	
        	return reader;
			

		}
        
        
}
