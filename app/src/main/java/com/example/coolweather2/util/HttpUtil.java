package com.example.coolweather2.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 功能描述: 网络交互工具类
 * 时　　间: 2018/6/22.14:37
 * 作    者: maijiawen
 * 版本信息: V1.0.0
 **/
public class HttpUtil {


    public static void sendOkHttpRequest(String address ,  okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
