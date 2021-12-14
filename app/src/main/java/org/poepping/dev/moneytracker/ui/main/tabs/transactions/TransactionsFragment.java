package org.poepping.dev.moneytracker.ui.main.tabs.transactions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.viewbinding.ViewBinding;
import org.jetbrains.annotations.NotNull;
import org.poepping.dev.moneytracker.databinding.TransactionsMainBinding;
import org.poepping.dev.moneytracker.ui.main.tabs.TabFragment;

public class TransactionsFragment extends TabFragment {

    private static final String TAG = "TransactionsFragment";

    public static TransactionsFragment newInstance() {
        TransactionsFragment fragment = new TransactionsFragment();
        Bundle bundle = new Bundle();
//        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected Class<? extends ViewModel> getViewModelClass() {
        return TransactionsModel.class;
    }

    @Override
    protected Class<? extends ViewBinding> getViewBindingClass() {
        return TransactionsMainBinding.class;
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
