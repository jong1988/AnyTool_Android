package com.utils.library.net;

import java.util.Map;

/**
 * Created by dds on 2019/7/3.
 * android_shuai@163.com
 */
public class HttpRequestPresenter implements HttpRequest {
    private HttpRequest httpRequest;
    private static volatile HttpRequestPresenter instance;

    private HttpRequestPresenter(HttpRequest httpRequest) {
        this.httpRequest = httpRequest;
    }

    public static void init(HttpRequest httpRequest) {
        if (null == instance){
            synchronized (HttpRequestPresenter.class){
                if (null == instance){
                    instance = new HttpRequestPresenter(httpRequest);
                }
            }
        }
    }

    public static HttpRequestPresenter getInstance() {
        return instance;
    }

    @Override
    public void get(String url, Map<String, String> params, ICallback callback) {
        httpRequest.get(url,params,callback);
    }

    @Override
    public void post(String url, Map<String, String> params, ICallback callback) {
        httpRequest.post(url,params,callback);
    }
}