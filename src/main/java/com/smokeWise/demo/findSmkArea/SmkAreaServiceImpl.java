package com.smokeWise.demo.findSmkArea;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



@Service("smkAreaServiceImpl")
@PropertySource("classpath:findSmkArea.properties")
public class SmkAreaServiceImpl implements SmkAreaService{

    //Field
    private String KwanakApiKey;
    private String KwanakApiUrl;

    //Constructor DI
    public SmkAreaServiceImpl(@Value("${Data-go-kr-Kwanak.apiKey}") String KwanakApiKey,
                              @Value("${Data-go-kr-Kwanak.URL}") String KwanakApiUrl) {
        this.KwanakApiKey = KwanakApiKey;
        this.KwanakApiUrl = KwanakApiUrl;

        System.out.println(this.getClass());
    }

    //흡연구역 정보 가져오기
    public Map<String, Object> getSmkArea() throws Exception {
        System.out.println("SmkAreaServiceImpl에서 getSmkArea 실행됨.");

        Map<String, Object> resultMap = new HashMap<>();

        try {
            StringBuilder urlBuilder = new StringBuilder(KwanakApiUrl);
            urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + KwanakApiKey);
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8"));
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));

            URL url = new URL(urlBuilder.toString());

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response Code: [ "+conn.getResponseCode()+" ]");
            BufferedReader rd;

            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            }else{
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();

            org.json.JSONObject xmlJSONObj = XML.toJSONObject(sb.toString());
            String xmlJSONObjString = xmlJSONObj.toString();
            System.out.println("### xmlJSONObjString=>"+xmlJSONObjString);

            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, Object> map = new HashMap<>();
            map = objectMapper.readValue(xmlJSONObjString, new TypeReference<Map<String,Object>>(){});
            Map<String, Object> dataResponse = (Map<String, Object>) map.get("response");
            Map<String, Object> body = (Map<String, Object>) dataResponse.get("body");
            Map<String, Object> items = null;
            List<Map<String, Object>> itemList = null;

            items = (Map<String, Object>) body.get("items");
            itemList = (List<Map<String, Object>>) items.get("item");

            System.out.println("### map="+map);
            System.out.println("### dataResponse="+dataResponse);
            System.out.println("### body="+body);
            System.out.println("### items="+items);
            System.out.println("### itemList="+itemList);
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.clear();
            resultMap.put("Result", "0001");
        }

        return resultMap;
    }
}
