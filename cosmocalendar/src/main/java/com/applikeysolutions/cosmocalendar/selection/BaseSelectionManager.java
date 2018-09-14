package com.applikeysolutions.cosmocalendar.selection;

import android.support.annotation.NonNull;
import android.support.v4.util.Pair;

import com.applikeysolutions.cosmocalendar.model.Day;

public abstract class BaseSelectionManager {

    protected OnDaySelectedListener onDaySelectedListener;

    public abstract void setInitialPair(Day start, Day end);

    public abstract void setInitialDay(Day mDay);

    public abstract void toggleDay(@NonNull Day day);

    public abstract boolean isDaySelected(@NonNull Day day);

    public abstract void clearSelections();

    public abstract Pair<Day, Day> getDays();

    public BaseSelectionManager() {
    }
}
