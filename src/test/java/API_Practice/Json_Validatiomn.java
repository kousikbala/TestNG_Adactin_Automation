package API_Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_Validatiomn {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		
		File f = new File("C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\src\\test\\java\\com\\api_payload\\payload.json");
		
		FileReader reader = new FileReader(f);
		
		JSONParser parser = new JSONParser();
		
		Object obj = parser.parse(reader);
		
		JSONObject jsonobj = (JSONObject) obj;
		
		Object object = jsonobj.get("Team");
		
		String valvue = object.toString();
		
		System.out.println("Team : " + valvue);
	}

}
