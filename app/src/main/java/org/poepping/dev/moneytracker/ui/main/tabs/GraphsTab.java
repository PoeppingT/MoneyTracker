package org.poepping.dev.moneytracker.ui.main.tabs;

import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;
import org.jetbrains.annotations.NotNull;

public class GraphsTab implements MainTab {
    @Override
    public void doConfigure(@NonNull @NotNull TabLayout.Tab tab) {
        tab.isSelected();
        tab.setIcon(android.R.drawable.ic_menu_preferences);
        tab.setText("Graphs");
    }
}
