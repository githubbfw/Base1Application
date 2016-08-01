package com.bfw.administrator.base1application.main;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;

/**
 * Created by Administrator on 2016/8/1 0001.
 */
public class MainPresenter implements MainContract.Presenter {
    private MainContract.Model model;
    private MainContract.View view;

    public MainPresenter(MainContract.Model model, MainContract.View view) {

        this.model = model;
        this.view = view;
    }


    @Override
    public void getData() {
        model.getData(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                view.onFail("网络连接错误！");
            }

            @Override
            public void onResponse(Response response) throws IOException {
//                String string = response.body().toString();
                view.onSucess(response.body().toString());

            }
        });

    }
}
