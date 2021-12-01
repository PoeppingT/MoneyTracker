package org.poepping.dev.moneytracker.ui.main.tabs;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import org.poepping.dev.moneytracker.R;

public class MainTabs implements TabLayoutMediator.TabConfigurationStrategy {

    private static final String TAG = "MainTabs";

    private static final MainTab[] MAIN_TABS = new MainTab[] {
            new GraphsTab(),
            new TransactionsTab(),
            new PreferencesTab()
    };

    @Override
    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
        MAIN_TABS[position].doConfigure(tab);
    }
}
