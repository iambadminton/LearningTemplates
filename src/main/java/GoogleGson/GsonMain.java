package GoogleGson;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Sanya on 21.10.2018.
 */
public class GsonMain {
    public static void main(String[] args) {
        String str = "{\n" +
                "    \"name\" : \"Admin\",\n" +
                "    \"age\" : 36,\n" +
                "    \"rights\" : [\n" +
                "        {\"roleName\" : \"admin\", \"roleIds\" : [1,2,3] },\n" +
                "        {\"roleName\" : \"editor\", \"roleIds\" : [4,5,6] },\n" +
                "       {\"roleName\" : \"contributor\", \"roleIds\" : [7,8,9]}\n" +
                "], " +
                "\"param3\": \"erererer\"} ";

        JsonObject gson = new Gson().fromJson(str, JsonObject.class);
        Param1 param1 = new Gson().fromJson(str, Param1.class);
        Param1 param2 = new Gson().fromJson(str, Param1.class);
        JsonArray jsonArray = gson.getAsJsonArray("rights");
        Rights[] rights = new Gson().fromJson(jsonArray, Rights[].class);

        System.out.println("param1=" + param1.param1);
        System.out.println("param2=" + param2.param1);
        for (int i = 0; i < rights.length; i++) {
            System.out.println(i +"-й элемент:");
            System.out.println(rights[i].roleName);
            System.out.println(rights[i].roleIds[0]);
            System.out.println(rights[i].roleIds[1]);
            System.out.println(rights[i].roleIds[2]);
        }
        Param3 param3 = new Gson().fromJson(str, Param3.class);
        System.out.println("param3=" + param3.param3);


    }

    class Param1 {
        @SerializedName("name")
        String param1;
    }

     class Rights {
        @SerializedName("roleName")
        String roleName;
        @SerializedName("roleIds")
        int[] roleIds;
     }
     class Param3 {
        @SerializedName("param3")
        String param3;
     }


        /*Similar java cose will be :*/
       /* Collection collection = new ArrayList<>();
        Gson gson = new Gson();
        GsonObject gsonObject = gson.fromJson(str, GsonObject.class);

        System.out.println(gsonObject.toString());


    }


    class GsonObject {
        @SerializedName("name")
        String name;
        @SerializedName("age")
        int age;
        @SerializedName("rights")
        List<GsonArrObject> rights;


    }


    class GsonArrObject {
        @SerializedName("rolename")
        String rolename;
        @SerializedName("roleIds")
        List<Integer> arr;
    }*/
}
