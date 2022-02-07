package nl.saxion.oop.week4.model;

import java.time.LocalDateTime;

public class Appointment {
    private String title;
    private LocalDateTime dateTime;

    public Appointment(LocalDateTime dateTime, String title) {
        this.dateTime = dateTime;
        this.title = title;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getTitle() {
        return title;
    }

    public boolean occursOn(int year, int month, int day) {
        //TODO: Implement this method in the subclasses!!!
        throw new IllegalStateException("This method should never be called!");
    }

    @Override
    public String toString() {
        return dateTime + ". " + title;
    }
}
