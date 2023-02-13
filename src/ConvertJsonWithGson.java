import java.util.Map;

import com.google.gson.Gson;

import beans.MemberBean;

public class ConvertJsonWithGson {
    public static void main(String[] args) {
        // 문자열 json -> Map
        Gson gson = new Gson();
        String jsonStr = "{id:1, name:KimBG}";
        Map jsonMap = gson.fromJson(jsonStr, Map.class);

        // Map -> 문자열 Json
        String mapStr = gson.toJson(jsonMap);

        // 문자열 Json -> Object(bean, model, vo)
        String jsonStrBean = "{firstName:Kim, secondName:B, handleName:G}";
        MemberBean memberBean = gson.fromJson(jsonStrBean, MemberBean.class);

        int i = 0;
    }
}
