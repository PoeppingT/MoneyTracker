package org.poepping.dev.moneytracker.ui.main;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import org.poepping.dev.moneytracker.R;
import org.poepping.dev.moneytracker.ui.main.tabs.MainTabs;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentStateAdapter {

    private static final String TAG = "SectionsPagerAdapter";

    private final Context context;
    private final MainTabs mainTabs;

    public SectionsPagerAdapter(Context context, MainTabs mainTabs, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.context = context;
        this.mainTabs = mainTabs;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Log.i(TAG, "createFragment:" + position);
        // getItem is called to instantiate the fragment for the given page
        return mainTabs.fragmentForTab(position);
    }

    @Override
    public int getItemCount() {
        // Show 3 total pages.
        return 3;
    }
}