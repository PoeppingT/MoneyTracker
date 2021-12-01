package org.poepping.dev.moneytracker.ui.main.tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import org.poepping.dev.moneytracker.databinding.GraphsMainBinding;
import org.poepping.dev.moneytracker.ui.main.tabs.preferences.PreferencesViewModel;

public abstract class TabFragment extends Fragment {

    protected ViewModel viewModel;
    protected ViewBinding binding;
    protected View root;

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
        binding = GraphsMainBinding.inflate(inflater, container, false);
        root = binding.getRoot();
        return onCreateViewInternal(inflater, container, savedInstanceState);
    }

    @Override
    public final void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    protected abstract Class<? extends ViewModel> getViewModelClass();
    protected abstract Class<? extends ViewBinding> getViewBindingClass();
    protected abstract void onCreateInternal(Bundle savedInstanceState);
    protected abstract View onCreateViewInternal(
            @NonNull LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState);
}
