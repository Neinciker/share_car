package com.car;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class demoDistence {
    /*
        * Java http 请求
        */
    public static String loadJson (String url) {
        StringBuilder json = new StringBuilder();
        try {
            //下面那条URL请求返回结果无中文，可不转换编码格式
            URL urlObject = new URL(url);
            URLConnection uc = urlObject.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String inputLine = null;
            while ( (inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json.toString();
    }
    /*
     * 高德地图WebAPI : 行驶距离测量
     */
    public static String distance(String origins,String destination) {
        int type = 1;
        String url = "http://restapi.amap.com/v3/distance?"
                + "origins="+origins
                +"&destination="+destination
                +"&type="+type
                +"&key=359c649d8333854832e7f8547f1fdfcb";
        JSONObject jsonobject = JSONObject.fromObject(loadJson(url));
        System.out.println(jsonobject.toString());
        JSONArray resultsArray = jsonobject.getJSONArray("results");
        JSONObject distanceObject = resultsArray.getJSONObject(0);
        String distance = distanceObject.getString("distance");
        return distance;
    }


    public static void main(String[] args) {
        //格式：   经度,纬度
        //注意：高德最多取小数点后六位
        String origin = "116.398140"+","+"26.059369";
        String destination = "116.374028"+","+"39.907586";
        String distance = distance(origin, destination);
        System.out.println(distance);
    }

}
