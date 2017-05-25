package com.example.zeeshan.fragmentsex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Simpleaddition extends Fragment {
    TextView textView_fragment;
    MainActivity activity = (MainActivity) getActivity();




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_simpleaddition, container, false);

        return view;

    }

}