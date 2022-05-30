package com.example.takavi.ui.howitswork;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.takavi.R;

public class SHowItsWork extends Fragment {

    private SHowItsWorkModel SHowItsWorkModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SHowItsWorkModel =
                new ViewModelProvider(this).get(SHowItsWorkModel.class);
        View root = inflater.inflate(R.layout.s_how_its_works, container, false);

        return root;
    }
}