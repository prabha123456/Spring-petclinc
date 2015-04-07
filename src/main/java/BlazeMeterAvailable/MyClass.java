package BlazeMeterAvailable;
import java.awt.PageAttributes.MediaType;

import org.springframework.stereotype.Controller;


@Controller
public class  MyClass{

    @Autowired(required = true)
    @RequestMapping(value = "/rest/gethellomessage", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    
    String gethellomessage() {

    	String message="hello";
        try { 

         MyClass cl=new MyClass();
            JSONObject jsonVersions = new JSONObject();
           

            JSONParser parser = new JSONParser();

            Object availableJson = null;
            availableJson = parser.parse(restResponse);
            JSONObject avableJsonObj = (JSONObject) availableJson;

            JSONArray buildtimeArray = (JSONArray) avableJsonObj.get("options");

         
        } catch (Exception e) {
			// TODO Auto-generated catch block
            // e.printStackTrace();
            return e.getMessage();

        }
        return  message;

    }

  
    
}
