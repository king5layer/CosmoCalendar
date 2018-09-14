package com.applikeysolutions.cosmocalendar.selection;

import android.support.annotation.NonNull;
import android.support.v4.util.Pair;

import com.applikeysolutions.cosmocalendar.model.Day;

/**
 * Created by leonardo2204 on 06/10/17.
 */

public class NoneSelectionManager extends BaseSelectionManager {

    @Override
    public void setInitialPair(Day start, Day end) {
        throw new RuntimeException("Not available");
    }

    @Override
    public void setInitialDay(Day mDay) {

    }

    @Override
    public void toggleDay(@NonNull Day day) {

    }

    @Override
    public boolean isDaySelected(@NonNull Day day) {
        return false;
    }

    @Override
    public void clearSelections() {

    }

    @Override
    public Pair<Day, Day> getDays() {
        return null;
    }


}
