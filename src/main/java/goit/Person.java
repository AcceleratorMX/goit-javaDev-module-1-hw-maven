package goit;

import com.google.gson.Gson;
import java.util.LinkedHashMap;

public class Person {
    public static void main( String[] args ) {

        LinkedHashMap<String, String> person = new LinkedHashMap<>();
        person.put("name", "Oleksandr");
        person.put("lastName", "Karpinskyi");

        String res = new Gson().toJson(person);
        System.out.println(res);
    }
}
