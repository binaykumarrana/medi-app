package binay.meditrackapplication.ui.medlists;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import binay.meditrackapplication.R;

/**
 * Created by Binay on 16/06/17.
 */

public class MediListAdapter extends RecyclerView.Adapter<MediListAdapter.CustomViewHolder> {
    private Context mContext;
    private List<MedicineModel> mMedicineModelList;

    public MediListAdapter(Context context, List<MedicineModel> medicineModelList) {
        mContext = context;
        mMedicineModelList = medicineModelList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(mContext).inflate(R.layout.fragment_account, parent, false));
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        MedicineModel medicineModel = mMedicineModelList.get(position);
    }

    @Override
    public int getItemCount() {
        return mMedicineModelList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public CustomViewHolder(View itemView) {
            super(itemView);
        }
    }
}
