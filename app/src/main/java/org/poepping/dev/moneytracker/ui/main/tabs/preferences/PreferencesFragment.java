package org.poepping.dev.moneytracker.ui.main.tabs.preferences;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import org.jetbrains.annotations.NotNull;
import org.poepping.dev.moneytracker.databinding.GraphsMainBinding;
import org.poepping.dev.moneytracker.databinding.PreferencesMainBinding;
import org.poepping.dev.moneytracker.ui.main.tabs.TabFragment;
import org.poepping.dev.moneytracker.ui.main.tabs.graphs.GraphsFragment;
import org.poepping.dev.moneytracker.ui.main.tabs.graphs.GraphsViewModel;

public class PreferencesFragment extends TabFragment {

    private static final String TAG = "PreferencesFragment";

    public static PreferencesFragment newInstance() {
        PreferencesFragment fragment = new PreferencesFragment();
        Bundle bundle = new Bundle();
//        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected Class<? extends ViewModel> getViewModelClass() {
        return PreferencesViewModel.class;
    }

    @Override
    protected Class<? extends ViewBinding> getViewBindingClass() {
        return PreferencesMainBinding.class;
    }

    @Override
    protected void onCreateInternal(Bundle savedInstanceState) {
        // we can update the view model here with specific information if necessary

//        int index = 1;
//        if (getArguments() != null) {
//            index = getArguments().getInt(ARG_SECTION_NUMBER);
//        }
//        graphsViewModel.setIndex(index)
    }

    @Override
    protected View onCreateViewInternal(@NonNull @NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // set up observers if necessary
//        final TextView textView = binding.sectionLabel;
//        pageViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;
    }
}
