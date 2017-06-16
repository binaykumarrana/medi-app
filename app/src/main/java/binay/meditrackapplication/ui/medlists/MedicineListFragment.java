package binay.meditrackapplication.ui.medlists;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import binay.meditrackapplication.R;

/**
 * Created by Binay on 16/06/17.
 */

public class MedicineListFragment extends Fragment {
    public static MedicineListFragment getInstance() {
        return new MedicineListFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_med_list, container, false);
    }
}
