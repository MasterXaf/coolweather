package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author Leader_xu
 * 实现和服务器的交互
 */
public class HttpUtil {
    /**
     * 传入请求地址，并注册一个回调来处理服务器响应就可以了
     * 由于服务器返回的省市县数据都是JSON格式的，所以我们最好再提供一个工具类来解析和处理
     * 这种数据，故在util包下新建一个Utility类
     * @param address
     * @param callback
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
