package com.bfw.administrator.base1application.main;

import com.bfw.administrator.base1application.config.UrlConfig;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by Administrator on 2016/8/1 0001.
 */
public class MainModel implements MainContract.Model{


    @Override
    public void getData(Callback callback) {

            OkHttpClient client=new OkHttpClient();
            Request request=new Request.Builder().url(UrlConfig.Path.BASE_URL).build();
            client.newCall(request).enqueue(callback);

        }

}
