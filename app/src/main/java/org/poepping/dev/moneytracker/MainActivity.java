package org.poepping.dev.moneytracker;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.StringRes;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.tabs.TabLayoutMediator;
import org.poepping.dev.moneytracker.ui.main.SectionsPagerAdapter;
import org.poepping.dev.moneytracker.databinding.ActivityMainBinding;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    @StringRes
    private static final int[] TAB_TITLES = new int[] {
            R.string.tab_text_graphs,
            R.string.tab_text_transactions,
            R.string.tab_text_settings
    };

    private static final String TAG = "MainActivity (AppCompatActivity)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: " + savedInstanceState + "(bundle)");

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        Log.i(TAG, "binding: " + binding);
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getBaseContext(), this);
        ViewPager2 viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        new TabLayoutMediator(tabs, viewPager,
                (tab, position) -> {
                    Log.i(TAG, "getPageTitle:" + position);
                    Log.i(TAG, Arrays.stream(new Exception().getStackTrace()).collect(Collectors.toList()).toString());
                    tab.setText(TAB_TITLES[position]);
                }).attach();
        FloatingActionButton fab = binding.fab;

        fab.setOnClickListener((view) ->
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
        );
    }
}