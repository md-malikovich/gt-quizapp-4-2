package com.geektech.quizapp_gt_4_2;

import android.app.Application;
import com.geektech.quizapp_gt_4_2.data.PreferenceHelper;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceHelper.init(this);
    }

}
