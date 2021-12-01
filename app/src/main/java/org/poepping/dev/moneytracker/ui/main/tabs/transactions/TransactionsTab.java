package org.poepping.dev.moneytracker.ui.main.tabs.transactions;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import org.jetbrains.annotations.NotNull;
import org.poepping.dev.moneytracker.ui.main.tabs.MainTab;

public class TransactionsTab extends MainTab {
    @Override
    public void doConfigure() {
        tab.setText("Transactions");
    }

    public Fragment getFragment() {
        return TransactionsFragment.newInstance();
    }
}
