package com.example.asus.workking.ViewPageFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.example.asus.workking.R;

/**
 * Created by asus on 2017/2/7.
 */

public class TestFragment extends Fragment implements View.OnClickListener{
    private String mTitle = "Defult";
    public final static String TITLE = "tilte";


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if(getArguments() != null){
            mTitle = getArguments().getString(TITLE);
        }
        //设置Fragment布局
        View view = inflater.inflate(R.layout.testpage, container, false);

        initView(view);

        return view;
    }

    private void initView(View view) {

    }


    @Override
    public void onClick(View view) {

    }
}
