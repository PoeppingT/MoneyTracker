package org.poepping.dev.moneytracker;

import android.os.Bundle;
import android.util.Log;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.tabs.TabLayoutMediator;
import org.poepping.dev.moneytracker.ui.main.SectionsPagerAdapter;
import org.poepping.dev.moneytracker.databinding.ActivityMainBinding;
import org.poepping.dev.moneytracker.ui.main.tabs.MainTabs;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity (AppCompatActivity)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MainTabs mainTabs = new MainTabs();
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(
                getBaseContext(),
                mainTabs,
                this);
        ViewPager2 viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        new TabLayoutMediator(tabs, viewPager, mainTabs).attach();
        FloatingActionButton fab = binding.fab;

        fab.setOnClickListener((view) ->
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
        );
    }
}