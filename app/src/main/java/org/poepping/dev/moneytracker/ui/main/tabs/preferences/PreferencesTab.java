package org.poepping.dev.moneytracker.ui.main.tabs.preferences;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import org.jetbrains.annotations.NotNull;
import org.poepping.dev.moneytracker.ui.main.tabs.MainTab;

public class PreferencesTab extends MainTab {
    @Override
    public void doConfigure() {
        tab.setIcon(android.R.drawable.ic_menu_preferences);
    }

    @Override
    public Fragment getFragment() {
        return PreferencesFragment.newInstance();
    }
}
