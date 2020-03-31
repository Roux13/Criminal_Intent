package com.bignerdranch.android.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {

    private static CrimeLab INSTANCE;

    private List<Crime> crimes;

    private CrimeLab(Context context) {
        crimes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i % 2 == 0);
            crimes.add(crime);
        }
    }

    public static CrimeLab getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new CrimeLab(context);
        }
        return INSTANCE;
    }

    public List<Crime> getCrimes() {
        return crimes;
    }

    public Crime getCrime(UUID id) {
        Crime result = new Crime();
        for (Crime crime : crimes) {
            if (crime.getId().equals(id)) {
                result = crime;
            }
        }
        return result;
    }
}
