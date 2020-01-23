package com.geektech.quizapp_gt_4_2.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

import com.geektech.quizapp_gt_4_2.R;
import com.geektech.quizapp_gt_4_2.data.PreferenceHelper;
import com.geektech.quizapp_gt_4_2.main.MainActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                selectActivity();
            }
        }, 1_000);
    }

    private void selectActivity() {
        if(PreferenceHelper.getIsFirstLaunch()) {
            MainActivity.start(this);
        } else {
            PreferenceHelper.setIsFirstLaunch();
            MainActivity.start(this);
        }
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        finish();
    }
}
