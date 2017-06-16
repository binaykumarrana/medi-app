package binay.meditrackapplication.ui.account;

import co.uk.rushorm.core.Rush;
import co.uk.rushorm.core.RushCallback;
import co.uk.rushorm.core.RushCore;

/**
 * Created by Binay on 16/06/17.
 */

public class SosUser implements Rush {
    public String name;
    public int phoneNum;


    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public String getName() {
        return name;
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
