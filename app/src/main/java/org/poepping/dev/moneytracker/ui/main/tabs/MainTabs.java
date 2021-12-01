package org.poepping.dev.moneytracker.ui.main.tabs;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import org.poepping.dev.moneytracker.ui.main.tabs.graphs.GraphsTab;
import org.poepping.dev.moneytracker.ui.main.tabs.preferences.PreferencesTab;
import org.poepping.dev.moneytracker.ui.main.tabs.transactions.TransactionsTab;

public class MainTabs implements TabLayoutMediator.TabConfigurationStrategy {

    private static final String TAG = "MainTabs";

    private static final MainTab[] MAIN_TABS = new MainTab[] {
            new GraphsTab(),
            new TransactionsTab(),
            new PreferencesTab()
    };

    @Override
    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
        MainTab thisTab = MAIN_TABS[position];
        thisTab.setTab(tab);
        thisTab.doConfigure();
        MAIN_TABS[position].doConfigure();
    }

    public Fragment fragmentForTab(int position) {
        return MAIN_TABS[position].getFragment();
    }
}
