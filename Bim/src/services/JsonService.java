package services;

import models.Brand;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class JsonService implements IJsonService {

    @Override
    public List<Brand> deserializeBrand() {
        try {
            // Nederste eksempel: https://www.geeksforgeeks.org/parse-json-java/
            Object obj = new JSONParser().parse(new FileReader("Bim/src/json/brands.json"));

            // typecasting obj to JSONObject
            JSONObject jo = (JSONObject) obj;
            var keys = jo.keySet().iterator();

            while(keys.hasNext()) {
                var name = keys.next();
                var properties = jo.get(name);
            }

        } catch (IOException e) {
            System.out.println("IOException during JSON parsing.");
        } catch (ParseException e) {
            System.out.println("ParseException during JSON parsing.");
        }
        return null;
    }
}
