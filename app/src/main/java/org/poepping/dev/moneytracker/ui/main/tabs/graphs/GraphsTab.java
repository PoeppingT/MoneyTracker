package org.poepping.dev.moneytracker.ui.main.tabs.graphs;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import org.jetbrains.annotations.NotNull;
import org.poepping.dev.moneytracker.ui.main.tabs.MainTab;

public class GraphsTab extends MainTab {

    private static final String TAG = MAINTAB_TAG + ":graph";

    @Override
    public void doConfigure() {
        tab.isSelected();
        tab.setText("Graphs");
    }

    public Fragment getFragment() {
        return GraphsFragment.newInstance();
    }
}
