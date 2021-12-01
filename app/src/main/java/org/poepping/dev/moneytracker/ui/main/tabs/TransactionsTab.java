package org.poepping.dev.moneytracker.ui.main.tabs;

import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;
import org.jetbrains.annotations.NotNull;

public class TransactionsTab implements MainTab {
    @Override
    public void doConfigure(@NonNull @NotNull TabLayout.Tab tab) {
        tab.setText("Transactions");
    }
}
