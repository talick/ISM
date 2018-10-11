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
import com.sunrisestudio.ism.ism.ui.main_screen.fragments.AboutUsFragment;
import com.sunrisestudio.ism.ism.ui.main_screen.fragments.ContactFragment;
import com.sunrisestudio.ism.ism.ui.main_screen.fragments.MenuFragment;

public class MainActivity extends AppCompatActivity {

    private Fragment menuFragment, aboutUsFragment, contactFragment;

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
                    if (aboutUsFragment == null) {
                        aboutUsFragment= new AboutUsFragment();
                        Bundle bundle = new Bundle();
                        bundle.putInt("i", 1);
                        aboutUsFragment.setArguments(bundle);
                        loadFragment(aboutUsFragment, 1);
                        return true;
                    }
                    loadFragment(aboutUsFragment, 1);
                    return true;
                case R.id.navigation_ism:

                return true;
                case R.id.navigation_contact:
                    if (contactFragment == null) {
                        contactFragment= new ContactFragment();
                        Bundle bundle = new Bundle();
                        bundle.putInt("i", 1);
                        contactFragment.setArguments(bundle);
                        loadFragment(contactFragment, 1);
                        return true;
                    }
                    loadFragment(contactFragment, 1);
                    return true;
                case R.id.navigation_profile:

                    return true;

                    case  R.id.
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
        transaction.commit();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}
