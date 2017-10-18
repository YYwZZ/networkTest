package app.wyyzzz.networktest;

/**
 * Created by wuyuanyang on 2017/10/18.
 */

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
