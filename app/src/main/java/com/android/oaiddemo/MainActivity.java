package com.android.oaiddemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.android.miitmdidadapter.MiitHelper;

/**
 * Description:
 * <p>
 * Created by yfb on 2019/12/18.
 */

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void getOaid(View view){
        MiitHelper.getDeviceIds(MainActivity.this);
    }

}
