package com.example.takavi.ui.aboutus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.takavi.R;

public class SAboutUs extends Fragment {

    private SAboutUsModel SAboutUsModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SAboutUsModel =
                new ViewModelProvider(this).get(SAboutUsModel.class);
        View root = inflater.inflate(R.layout.s_about_us, container, false);

        return root;
    }
}