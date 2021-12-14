package org.poepping.dev.moneytracker.ui.main.tabs.preferences;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.ViewModel;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import org.poepping.dev.moneytracker.R;
import org.poepping.dev.moneytracker.databinding.PreferencesMainBinding;
import org.poepping.dev.moneytracker.ui.main.tabs.TabFragment;

import java.util.Arrays;

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
    protected int getLayoutResource() {
        return R.layout.preferences_main;
    }

    @Override
    protected Class<? extends ViewModel> getViewModelClass() {
        return PreferencesModel.class;
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

//        FloatingActionButton fab = ((PreferencesMainBinding)binding).fab;
//
//        fab.setOnClickListener((view) ->
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show()
//        );
//        Log.i(TAG, "Binding: " + binding + " " + binding.getRoot() + " " + binding.getClass());
//        PreferencesMainBinding preferencesMainBinding = (PreferencesMainBinding) binding;
//        Log.i(TAG, "PBinding: " + preferencesMainBinding + " " + preferencesMainBinding.getRoot() + " " + preferencesMainBinding.fab);
    }

    @Override
    protected View onCreateViewInternal(View view, Bundle savedInstanceState) {
        // set up observers if necessary
        Log.i(TAG, "Binding: " + binding + " " + binding.getClass());

        FloatingActionButton fab = ((PreferencesMainBinding)binding).fab;

        fab.setOnClickListener((v) ->
                Snackbar.make(v.getRootView(), "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
        );
        Log.i(TAG, "ViewModel: " + viewModel.getClass() + " " + Arrays.toString(viewModel.getClass().getDeclaredMethods()));
        Log.i(TAG, "View: " + view.getClass() + " " + view.getBackground() + " " + view.getDisplay());

        return view;
    }
}
