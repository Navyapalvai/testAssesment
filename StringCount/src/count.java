import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class count {


	
	public static void main(String[] args) 
    { 

        //CANT BE FIXED
        String phrase = "Walmart Technology is reinventing the way the world shops and we’ve only just begun. Our team includes @Walmart Labs in Silicon Valley and Bengaluru, which powers the eCommerce experience, as well as technology teams across data and analytics, retail, back office and more who help power store and digital experiences.";

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] ignored = phrase.split(" ");

        //CAN BE FIX THIS POINT ON.
        for (String ignore : ignored) 
        {
            Integer count = map.get(ignore);
            if (count == null) 
            {
                count = 0;
            }
            map.put(ignore, count + 1);
        }
	      Gson gson = new Gson();

	      //convert java object to JSON format
	      String json = gson.toJson(map);

	      System.out.println(json);
       // System.out.println(map);
    }
}


	   



		   


