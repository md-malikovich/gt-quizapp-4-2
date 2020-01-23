package com.geektech.quizapp_gt_4_2.history;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.geektech.quizapp_gt_4_2.R;

public class HistoryFragment extends Fragment {

    private HistoryViewModel mViewModel;

    public static HistoryFragment newInstance() {
        return new HistoryFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.history_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(HistoryViewModel.class);

        mViewModel.history.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.d("ololo", s);
            }
        });
    }
}
//TODO: создать адаптер и вьюхолдер
