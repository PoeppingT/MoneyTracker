package org.poepping.dev.moneytracker.ui.main;

import android.util.Log;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PageViewModel extends ViewModel {

    private static final String TAG = "PageViewModel";

    private final MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private final LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        private static final String TAG = PageViewModel.TAG + " TransformationsMapFunction";

        @Override
        public String apply(Integer input) {
            Log.i(TAG, "apply: " + input);
            Log.i(TAG, Arrays.stream(new Exception().getStackTrace()).collect(Collectors.toList()).toString());
            return "Hello world from section: " + input;
        }
    });

    public void setIndex(int index) {
        Log.i(TAG, "setIndex: " + index);
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        Log.i(TAG, "getText called!");
        return mText;
    }
}