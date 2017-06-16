package binay.meditrackapplication.ui.medlists;

import co.uk.rushorm.core.Rush;
import co.uk.rushorm.core.RushCallback;
import co.uk.rushorm.core.RushCore;

/**
 * Created by Binay on 16/06/17.
 */

public class MedicineModel implements Rush {
    public String medName;
    public String medDose;
    public int medQuantity;
    public int numberOfDose;
    public String reminderTime;
    public int numberOfMedPurchased;

    public int getMedQuantity() {
        return medQuantity;
    }

    public void setMedDose(String medDose) {
        this.medDose = medDose;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public void setMedQuantity(int medQuantity) {
        this.medQuantity = medQuantity;
    }

    public void setNumberOfDose(int numberOfDose) {
        this.numberOfDose = numberOfDose;
    }

    public void setNumberOfMedPurchased(int numberOfMedPurchased) {
        this.numberOfMedPurchased = numberOfMedPurchased;
    }

    public void setReminderTime(String reminderTime) {
        this.reminderTime = reminderTime;
    }

    public int getNumberOfDose() {
        return numberOfDose;
    }

    public String getMedDose() {
        return medDose;
    }

    public int getNumberOfMedPurchased() {
        return numberOfMedPurchased;
    }

    public String getMedName() {
        return medName;
    }

    public String getReminderTime() {
        return reminderTime;
    }

    @Override
    public String toString() {
        return "MedicineModel{" +
                "medName='" + medName + '\'' +
                ", medDose='" + medDose + '\'' +
                ", medQuantity=" + medQuantity +
                ", numberOfDose=" + numberOfDose +
                ", reminderTime='" + reminderTime + '\'' +
                ", numberOfMedPurchased=" + numberOfMedPurchased +
                '}';
    }

    @Override
    public void save() {
        RushCore.getInstance().save(this);
    }

    @Override
    public void save(RushCallback callback) {
        RushCore.getInstance().save(this, callback);
    }

    @Override
    public void delete() {
        RushCore.getInstance().delete(this);
    }

    @Override
    public void delete(RushCallback callback) {
        RushCore.getInstance().delete(this, callback);
    }

    @Override
    public String getId() {
        return RushCore.getInstance().getId(this);
    }
}
