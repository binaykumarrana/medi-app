package binay.meditrackapplication.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Binay on 16/06/17.
 */

public class PreferenceManager {
    private SharedPreferences mSharedPreferences;
    private Context mContext;

    public PreferenceManager(Context context) {
        mContext = context;
        mSharedPreferences = mContext.getSharedPreferences("medtrack", Context.MODE_PRIVATE);
    }

    private SharedPreferences getPref() {
        return mSharedPreferences;
    }

    public void signupComplete(boolean s) {
        mSharedPreferences.edit().putBoolean("signup_done", s).apply();
    }

    public Boolean getSignupComplete() {
        return mSharedPreferences.getBoolean("signup_done", false);
    }
}
