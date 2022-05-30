package com.example.takavi.ui.howitswork;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SHowItsWorkModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SHowItsWorkModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}