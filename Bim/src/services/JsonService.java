package services;

import models.Brand;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;

public class JsonService implements IJsonService {
    @Override
    public Brand deserializeBrand() {
        try {
            // Nederste eksempel: https://www.geeksforgeeks.org/parse-json-java/
            Object obj = new JSONParser().parse(new FileReader("../json/brands.json"));
        } catch (IOException e) {
            System.out.println("IOException during JSON parsing.");
        } catch (ParseException e) {
            System.out.println("ParseException during JSON parsing.");
        }

        return null;
    }

    @Override
    public String serializeBrand() {
        return null;
    }
}
