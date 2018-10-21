package GoogleGson;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Sanya on 21.10.2018.
 */
public class GoogleExample {
    public static void main(String[] args) {
        String json = "{\"client\":\"127.0.0.1\",\"servers\":[\"8.8.8.8\",\"8.8.4.4\",\"156.154.70.1\",\"156.154.71.1\"]}";

        JsonObject jsonObject = new Gson().fromJson(json, JsonObject.class);
        JsonArray jsonArray = jsonObject.getAsJsonArray("servers");

        String[] arrName = new Gson().fromJson(jsonArray, String[].class);

        List<String> lstName = new ArrayList<>();
        lstName = Arrays.asList(arrName);

        for (String str : lstName) {
            System.out.println(str);
        }
    }
}
