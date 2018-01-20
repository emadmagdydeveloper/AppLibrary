package com.example.omd.library.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.omd.library.R;

/**
 * Created by Delta on 15/12/2017.
 */

public class Publisher_Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.publisher_fragment,container,false);
        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(), "publisher onResume", Toast.LENGTH_SHORT).show();
    }
}
