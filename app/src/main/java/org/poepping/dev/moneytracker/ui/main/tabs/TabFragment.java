package org.poepping.dev.moneytracker.ui.main.tabs;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import org.poepping.dev.moneytracker.R;
import org.poepping.dev.moneytracker.databinding.GraphsMainBinding;

import java.util.Arrays;

public abstract class TabFragment extends Fragment {

    private static final String TAG = "TabFragment";

    protected ViewModel viewModel;

    @Override
    public final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(getViewModelClass());

        onCreateInternal(savedInstanceState);
    }

    @Override
    public final View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        try {
            getViewBindingClass().getMethod("inflate", LayoutInflater.class, ViewGroup.class, boolean.class)
                    .invoke(null, inflater, container, false);
        } catch (Exception e) {
            // ignore
        }
        View view = inflater.inflate(getLayoutResource(), container, false);
        return onCreateViewInternal(view, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        // super.onViewCreated(view, savedInstanceState);
        // binding.getRoot().findViewById(R.id.view_pager);
    }

    @Override
    public final void onDestroyView() {
        super.onDestroyView();
    }

    protected abstract Class<? extends ViewModel> getViewModelClass();
    protected abstract Class<? extends ViewBinding> getViewBindingClass();
    protected abstract int getLayoutResource();
    protected abstract void onCreateInternal(Bundle savedInstanceState);
    protected abstract View onCreateViewInternal(
            View view,
            Bundle savedInstanceState);
}
