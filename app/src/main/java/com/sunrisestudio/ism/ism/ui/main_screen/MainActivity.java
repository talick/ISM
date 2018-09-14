package com.sunrisestudio.ism.ism.ui.main_screen;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.sunrisestudio.ism.ism.R;
import com.sunrisestudio.ism.ism.ui.helper.BottomNavigationViewHelper;
import com.sunrisestudio.ism.ism.ui.main_screen.fragments.MenuFragment;

public class MainActivity extends AppCompatActivity {

    private Fragment menuFragment, menuFragment2;

    private static final String BACK_STACK_ROOT_TAG = "root_fragment";
    private static final String BACK_STACK_ROOT_TAG2 = "root_fragment2";
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    if (menuFragment == null) {
                        menuFragment = new MenuFragment();
                        Bundle bundle = new Bundle();
                        bundle.putInt("i", 0);
                        menuFragment.setArguments(bundle);
                        loadFragment(menuFragment, 0);
                        return true;
                    }
                    loadFragment(menuFragment, 0);
                    return true;
                case R.id.navigation_about_us:
                    if (menuFragment2 == null) {
                        menuFragment2 = new MenuFragment();
                        Bundle bundle = new Bundle();
                        bundle.putInt("i", 1);
                        menuFragment2.setArguments(bundle);
                        loadFragment(menuFragment2, 1);
                        return true;
                    }
                    loadFragment(menuFragment2, 1);
                    return true;
                case R.id.navigation_ism:
                    return true;
                case R.id.navigation_contact:
                    return true;
                case R.id.navigation_profile:

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        BottomNavigationViewHelper.disableShiftMode(navigation);

        menuFragment = new MenuFragment();
        loadFragment(menuFragment, 0);


    }



    private void loadFragment(Fragment fragment, int i) {



        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fContainer, fragment);

        if (i == 0) {


            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.popBackStack(BACK_STACK_ROOT_TAG, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            transaction.addToBackStack(BACK_STACK_ROOT_TAG);
        } else if (i == 1) {


            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.popBackStack(BACK_STACK_ROOT_TAG2, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            transaction.addToBackStack(BACK_STACK_ROOT_TAG2);
        }

        transaction.commit();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}
