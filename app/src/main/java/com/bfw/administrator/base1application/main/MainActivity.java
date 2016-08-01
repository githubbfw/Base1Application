package com.bfw.administrator.base1application.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.bfw.administrator.base1application.R;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    private Button btnGet;
    private TextView textviewContent;

    private MainContract.Presenter presenter;
    private MainContract.Model model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter=new MainPresenter(model,this);
        model=new MainModel();



        btnGet= (Button) findViewById(R.id.btn_get);
        textviewContent= (TextView) findViewById(R.id.textview_content);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                //进行网络访问下载
//                OkHttpClient client=new OkHttpClient();
//              Request request=new Request.Builder().url("http://www.baidu.com").build();
//
//
//                 client.newCall(request).enqueue(new Callback() {
//                     @Override
//                     public void onFailure(Request request, IOException e) {
//                      //失败
//                     }
//
//                     @Override
//                     public void onResponse(Response response) throws IOException {
//
//                         if (response.code()==200){
//
//                         }else {
//
//                         }
//
//                     }
//                 });


                presenter.getData();




            }
        });
    }

    @Override
    public void onSucess(String content) {

textviewContent.setText(content);

    }

    @Override
    public void onFail(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
