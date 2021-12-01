package org.poepping.dev.moneytracker.ui.main.tabs;

import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;

public interface MainTab {
    void doConfigure(@NonNull TabLayout.Tab tab);
}
