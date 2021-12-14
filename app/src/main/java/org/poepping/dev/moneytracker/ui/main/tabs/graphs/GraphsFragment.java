package org.poepping.dev.moneytracker.ui.main.tabs.graphs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.viewbinding.ViewBinding;
import org.poepping.dev.moneytracker.R;
import org.poepping.dev.moneytracker.databinding.GraphsMainBinding;
import org.poepping.dev.moneytracker.ui.main.tabs.TabFragment;

public class GraphsFragment extends TabFragment {

    private static final String TAG = "GraphsFragment";

    public static GraphsFragment newInstance() {
        GraphsFragment fragment = new GraphsFragment();
        Bundle bundle = new Bundle();
//        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.graphs_main;
    }

    @Override
    protected Class<? extends ViewModel> getViewModelClass() {
        return GraphsModel.class;
    }

    @Override
    protected Class<? extends ViewBinding> getViewBindingClass() {
        return GraphsMainBinding.class;
    }

    @Override
    protected void onCreateInternal(Bundle savedInstanceState) {
        // we can update the view model here with specific information if necessary

//        int index = 1;
//        if (getArguments() != null) {
//            index = getArguments().getInt(ARG_SECTION_NUMBER);
//        }
//        graphsViewModel.setIndex(index);
    }

    @Override
    protected View onCreateViewInternal(View view, Bundle savedInstanceState) {
        // set up observers if necessary
//        final TextView textView = binding.sectionLabel;
//        pageViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return view;
    }
}