import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/testInterface")
    public String getDate(){
        //创建json数组
        JSONArray jsonArray  = new JSONArray();

        JSONObject jsonObject  = new JSONObject();
        jsonObject.put("testKey","testValue");
        jsonArray.add(jsonObject);
        return jsonArray.toJSONString();
    }
}
