package com.jsyoon.datainstance.Data;

import android.content.Context;
import android.databinding.Bindable;
import android.databinding.BaseObservable;

import com.jsyoon.datainstance.BR;


public class SettingData extends BaseObservable {

    private static SettingData instance;

    Context context;

    private boolean setting1;
    private boolean setting2;
    private String colorstring;
    private int textcolor;
    private int textsize;

    public static SettingData getInstance() {

        synchronized (SettingData.class) {
            if (instance == null) {
                instance = new SettingData();
            }
            return instance;
        }
    }

    @Bindable
    public boolean getSetting1() {
        return setting1;
    }
    @Bindable
    public boolean getSetting2() {
        return setting2;
    }
    @Bindable
    public String getColorString() {
        return colorstring;
    }
    @Bindable
    public int getTextColor() {
        return textcolor;
    }
    @Bindable
    public int gettextSize() {
        return textsize;
    }

    public void setSetting1(boolean val) {
        setting1 = val;
        notifyPropertyChanged(BR.setting1);
    }
    public void setSetting2(boolean val) {
        setting2 = val;
        notifyPropertyChanged(BR.setting2);
    }
    public void setColorString(String col) {
        colorstring=col;
        notifyPropertyChanged(BR.colorString);
    }
    public void setTextColor(int color) {
        textcolor = color;
        notifyPropertyChanged(BR.textColor);
    }
    public void setTextSize(int size) {
        textsize = size;
        notifyPropertyChanged(BR.textSize);
    }
}
