package com.bfw.administrator.base1application.main;



import com.bfw.administrator.base1application.base.IBaseModel;
import com.bfw.administrator.base1application.base.IBasePresenter;
import com.bfw.administrator.base1application.base.IBaseView;
import com.squareup.okhttp.Callback;

/**
 * Created by Administrator on 2016/8/1 0001.
 */
public class MainContract {

    public interface View extends IBaseView {

        void onSucess(String content);

        void onFail(String msg);

    }

    public interface Presenter extends IBasePresenter {
        void getData();

    }

    public interface Model extends IBaseModel {
        void getData(Callback callback);

    }

}
