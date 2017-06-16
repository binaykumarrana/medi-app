package binay.meditrackapplication;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import binay.meditrackapplication.ui.medlists.MedicineModel;
import co.uk.rushorm.android.AndroidInitializeConfig;
import co.uk.rushorm.android.RushAndroid;
import co.uk.rushorm.core.Rush;

/**
 * Created by Binay on 16/06/17.
 */

public class MediApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        List<Class<? extends Rush>> classes = new ArrayList<>();
        classes.add(MedicineModel.class);
        AndroidInitializeConfig androidInitializeConfig = new AndroidInitializeConfig(getApplicationContext(), classes);
        RushAndroid.initialize(androidInitializeConfig);
    }
}
