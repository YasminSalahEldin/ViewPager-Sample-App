package com.example.android.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabItem tab1, tab2, tab3;
    public PageAdapter pageAdapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tab1 = (TabItem) findViewById(R.id.Tab1);
        tab2 = (TabItem) findViewById(R.id.Tab2);
        tab3 = (TabItem) findViewById(R.id.Tab3);
        viewPager = findViewById(R.id.viewPager);

        pageAdapter =new PageAdapter(getSupportFragmentManager() , tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    pageAdapter.notifyDataSetChanged();
                }  else if (tab.getPosition() == 1) {
                    pageAdapter.notifyDataSetChanged();
                }   else  if (tab.getPosition() == 2){
                            pageAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}
