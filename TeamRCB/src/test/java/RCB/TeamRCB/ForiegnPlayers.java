package RCB.TeamRCB;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ForiegnPlayers {



	@Test
	public  void validateForiegnPlayers() {

		JSONParser jsonParser = new JSONParser();

		try (FileReader reader = new FileReader("employees.json"))
		{
			//Read JSON file
			Object obj = jsonParser.parse(reader);




		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
