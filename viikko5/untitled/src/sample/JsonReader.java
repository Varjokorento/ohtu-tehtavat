package sample;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JsonReader {
    /**
     * @author Crunchify.com
     */

    public class CrunchifyJSONReadFromFile {

        @SuppressWarnings("unchecked")
        public static void main(String[] args) {
            JSONParser parser = new JSONParser();

            try {

                Object obj = parser.parse(new FileReader(
                        "/Users/<username>/Documents/file1.txt"));

                JSONObject jsonObject = (JSONObject) obj;

                String name = (String) jsonObject.get("Name");
                String author = (String) jsonObject.get("Author");
                JSONArray companyList = (JSONArray) jsonObject.get("Company List");

                System.out.println("Name: " + name);
                System.out.println("Author: " + author);
                System.out.println("\nCompany List:");
                Iterator<String> iterator = companyList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
