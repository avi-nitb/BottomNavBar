package com.avinash.bottomnavbar.Activities;

import android.support.annotation.IdRes;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.avinash.bottomnavbar.Fragments.DeviceFilesFragment;
import com.avinash.bottomnavbar.Fragments.HomeFragment;
import com.avinash.bottomnavbar.Fragments.OthersFragment;
import com.avinash.bottomnavbar.R;
import com.avinash.bottomnavbar.Utils.TabPagerAdapter;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity
{

    BottomBar bottomBar;
    FrameLayout contentContainer;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        contentContainer = (FrameLayout) findViewById(R.id.contentContainer);
        viewPager = (ViewPager) findViewById(R.id.viewpager_container);



        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_favorites) {
                    // The tab with id R.id.tab_favorites was selected,
                    // change your content accordingly.
                } else if (tabId == R.id.tab_friends){
//                    setupViewPager();
                }
            }
        });
    }

  /*  private void setupViewPager()
    {
        TabPagerAdapter pagerAdapter = new TabPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new HomeFragment()); //index 0
        pagerAdapter.addFragment(new DeviceFilesFragment()); //index 1
        pagerAdapter.addFragment(new OthersFragment()); //index 2



        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Library");
        tabLayout.getTabAt(1).setText("Recent");
        tabLayout.getTabAt(2).setText("Local");

    }*/
}
