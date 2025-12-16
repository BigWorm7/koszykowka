package com.pt2.kosz;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PunktyViewModel2 extends ViewModel {
    private MutableLiveData<Integer> punkty2;

    public MutableLiveData<Integer> getPunkty2() {
        if(punkty2== null){
            punkty2 = new MutableLiveData<>();
            punkty2.setValue(0);
        }
        return punkty2;
    }

    public void setPunkty2(MutableLiveData<Integer> punkty2) {
        if(punkty2== null){
            punkty2 = new MutableLiveData<>();
            punkty2.setValue(0);
        }
        this.punkty2 = punkty2;
    }

    public void addPunkty2(int x){
        if(punkty2== null){
            punkty2 = new MutableLiveData<>();
            punkty2.setValue(0);
        }
        int aktualnePunkty2 = punkty2.getValue();
        punkty2.setValue(aktualnePunkty2 + x);
    }
}
