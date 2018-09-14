package com.applikeysolutions.cosmocalendar.selection;

import android.support.annotation.NonNull;
import android.support.v4.util.Pair;

import com.applikeysolutions.cosmocalendar.model.Day;

public class SingleSelectionManager extends BaseSelectionManager {

    private Day day;

    public SingleSelectionManager(OnDaySelectedListener onDaySelectedListener) {
        this.onDaySelectedListener = onDaySelectedListener;
    }

    @Override
    public void setInitialPair(Day start, Day end) {
        throw new RuntimeException("Not available");
    }

    @Override
    public void setInitialDay(Day mDay) {
        this.day = mDay;
    }

    public Day getInitialDay() {
        return this.day;
    }

    @Override
    public void toggleDay(@NonNull Day day) {
        this.day = day;
        onDaySelectedListener.onDaySelected();
    }

    @Override
    public boolean isDaySelected(@NonNull Day day) {
        return day.equals(this.day);
    }

    @Override
    public void clearSelections() {
        day = null;
    }

    @Override
    public Pair<Day, Day> getDays() {
        return null;
    }


}
