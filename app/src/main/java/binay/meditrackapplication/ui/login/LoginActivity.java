package binay.meditrackapplication.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import binay.meditrackapplication.MainActivity;
import binay.meditrackapplication.R;
import binay.meditrackapplication.utils.PreferenceManager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.nameTextView)
    TextView mNameTextView;
    @BindView(R.id.nameEditText)
    EditText mNameEditText;
    @BindView(R.id.ageTextView)
    TextView mAgeTextView;
    @BindView(R.id.ageEditText)
    EditText mAgeEditText;
    @BindView(R.id.okButton)
    Button mOkButton;
    PreferenceManager mPreferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        mPreferenceManager = new PreferenceManager(LoginActivity.this);


    }

    @OnClick(R.id.okButton)
    public void proceedWithLogin() {
        if (mNameEditText.getText().toString().isEmpty()) {
            mNameEditText.setError("Can't be empty");
            return;
        }
        if (mAgeEditText.getText().toString().isEmpty()) {
            mAgeEditText.setError("Can't be empty");
            return;
        }
        mPreferenceManager.signupComplete(true);
        startActivity(new Intent(LoginActivity.this, MainActivity.class).putExtra("ISFIRST", true));
        finish();
    }
}
