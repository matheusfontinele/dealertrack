package thinkbrq.dealertrack.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Utils {

	/**
	 * @param path
	 * @param index
	 * @return Somente o objeto desejado dentro do arquivo JSON
	 * 
	 *         We can create in this class a method that return an Array of
	 *         JSONObjects. I don't decided to do that, cause the scope requires
	 *         just one test case.
	 */
	public static JSONObject readJSONFile(String path, int index) {

		JSONParser jsonParser = new JSONParser();

		try {
			FileReader reader = new FileReader(path);

			JSONArray jsonArray = (JSONArray) jsonParser.parse(reader);

			return (JSONObject) jsonArray.get(index);
		} catch (FileNotFoundException e) {
			System.err.println("File not found! \n Location: " + path);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
