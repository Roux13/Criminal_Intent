package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Crime {
    private final UUID id;

    private String title;
    private Date date;
    private boolean solved;
    public Crime() {
        this.id = UUID.randomUUID();
        this.date = new Date();
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Crime crime = (Crime) o;
        return solved == crime.solved &&
                Objects.equals(id, crime.id) &&
                Objects.equals(title, crime.title) &&
                Objects.equals(date, crime.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, date, solved);
    }
}
