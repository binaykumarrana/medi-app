package binay.meditrackapplication.ui.medschedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import binay.meditrackapplication.R;

/**
 * Created by Binay on 16/06/17.
 */

public class MedScheduleFragment extends Fragment {
    public static MedScheduleFragment getInstance() {
        return new MedScheduleFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_med_schedule, container, false);
    }
}

