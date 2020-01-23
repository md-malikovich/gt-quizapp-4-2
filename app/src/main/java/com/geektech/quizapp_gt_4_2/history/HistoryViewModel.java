package com.geektech.quizapp_gt_4_2.history;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HistoryViewModel extends ViewModel {
    public MutableLiveData<String> history = new MutableLiveData<>();

    public HistoryViewModel() {
        Log.d("ololo", "History ViewModel created");
        history.setValue("First");
        //message.postValue("");
    }
}
