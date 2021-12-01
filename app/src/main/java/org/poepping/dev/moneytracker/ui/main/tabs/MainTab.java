package org.poepping.dev.moneytracker.ui.main.tabs;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;

public abstract class MainTab {

    protected TabLayout.Tab tab;

    public abstract void doConfigure();
    public abstract Fragment getFragment();

    void setTab(TabLayout.Tab tab) {
        this.tab = tab;
    }
}
