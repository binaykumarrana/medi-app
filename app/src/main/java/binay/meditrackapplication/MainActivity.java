package binay.meditrackapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import binay.meditrackapplication.ui.account.AccountFragment;
import binay.meditrackapplication.ui.medlists.MedicineListFragment;
import binay.meditrackapplication.ui.medschedule.MedScheduleFragment;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bottom_navigation)
    BottomNavigationView mBottomNavigation;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mBottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.action_favorites:
                        selectedFragment = MedicineListFragment.getInstance();
                        break;
                    case R.id.action_schedules:
                        selectedFragment = MedScheduleFragment.getInstance();
                        break;
                    case R.id.action_music:
                        selectedFragment = AccountFragment.getInstance();
                        break;
                }
                transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, selectedFragment);
                transaction.commit();
                return true;
            }
        });
        if (getIntent().getBooleanExtra("ISFIRST", false)) {
            transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_layout, AccountFragment.getInstance());
            transaction.commit();
            View view = mBottomNavigation.findViewById(R.id.action_music);
            view.performClick();
        } else {
            transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_layout, MedicineListFragment.getInstance());
            transaction.commit();
        }
    }

}
