package binay.meditrackapplication.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import binay.meditrackapplication.MainActivity;
import binay.meditrackapplication.R;
import binay.meditrackapplication.ui.login.LoginActivity;
import binay.meditrackapplication.utils.PreferenceManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        PreferenceManager preferenceManager = new PreferenceManager(SplashActivity.this);
        if (preferenceManager.getSignupComplete()) {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();
        } else {
            startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            finish();
        }
    }
}
