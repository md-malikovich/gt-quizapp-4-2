package com.geektech.quizapp_gt_4_2.main;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

        public MutableLiveData<String> message = new MutableLiveData<>();
        //public MutableLiveData<Integer> number = new MutableLiveData<>(); - do not work with primitive objects
        public MutableLiveData<Integer> counter = new MutableLiveData<>();
        private int mCount = 0;

        public MainViewModel() {

//        Executor executor = Executors.newSingleThreadExecutor();
//        Executor executor1 = Executors.newFixedThreadPool(5); // Pool from 5 Thread
//        executor1.execute(new Runnable() {
//            @Override
//            public void run() {
//                message.setValue("Crash"); // setValue() do not work in other Thread
//                message.postValue("Executor"); // 5 - Executor
//                Log.d("ololo", "Thread" + Thread.currentThread().getName()); // 3 - Threadpool-2-thread-1 - вне главного потока!
//            }
//        });
//        Log.d("ololo", "Thread" + Thread.currentThread().getName()); // 1 - Threadmain

            Log.d("ololo", "View model created"); // 2 - View model created
            message.setValue("First"); // setValue()work's only in Threadmain
            message.setValue("First1");
            message.setValue("First2");
            message.setValue("First3"); // 4 - First3
            //message.postValue("");
        }

        public void counterAdd(){
            mCount++;
            counter.setValue(mCount);
        }

        public void counterSub(){
            mCount--;
            counter.setValue(mCount);
        }

        public void onLoginClick(){
            //
        }

}
