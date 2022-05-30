package com.example.takavi.ui.aboutus;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SAboutUsModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SAboutUsModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}