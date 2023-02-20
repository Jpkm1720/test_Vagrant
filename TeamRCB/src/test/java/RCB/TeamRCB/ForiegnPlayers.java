package RCB.TeamRCB;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForiegnPlayers {



	@Test
	public  void validateForiegnPlayers() {
		
		
		ArrayList<String> foriegnplayers = new ArrayList<String> ();
		JSONParser parser = new JSONParser();
		try
		{
			Object obj = parser.parse(new FileReader("resources/testdata.json"));
			JSONObject jsonObject = (JSONObject) obj;

			JSONArray playerList = (JSONArray) jsonObject.get("player");
			//System.out.println(playerList);
			for(int i=0;i<playerList.size();i++)
			{
				JSONObject jsonobject = (JSONObject) playerList.get(i);
			    String countryname = jsonobject.get("country").toString();
				//System.out.println(countryname);
				if(!countryname.equals("India"))
				{
					foriegnplayers.add(jsonobject.get("name").toString());	
				}
				
			}

			System.out.println("List of Four Foriegn Players: "+foriegnplayers);



		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	
	@Test
	public  void validateWicketKeepers() {
		
		
		LinkedHashMap<String , String>  wicketKeeper = new LinkedHashMap<String , String>();
		JSONParser parser = new JSONParser();
		try
		{
			Object obj = parser.parse(new FileReader("resources/testdata.json"));
			JSONObject jsonObject = (JSONObject) obj;

			JSONArray playerList = (JSONArray) jsonObject.get("player");
			//System.out.println(playerList);
			for(int i=0;i<playerList.size();i++)
			{
				JSONObject jsonobject = (JSONObject) playerList.get(i);
			    String role = jsonobject.get("role").toString();
				//System.out.println(countryname);
				if(role.equals("Wicket-keeper"))
				{
					
					wicketKeeper.put(role,jsonobject.get("name").toString());
				}
				
			}

			System.out.println("List of WicketKeepers : "+wicketKeeper);
			



		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
