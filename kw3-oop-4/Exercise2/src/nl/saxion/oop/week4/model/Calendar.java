package nl.saxion.oop.week4.model;

import java.util.ArrayList;

/**
 * Class that represents a calendar with appointments.
 */
public class Calendar {
    /**
     * Adds an appointment to the calendar
     * @param appointment Single, weekly or monthly appointment.
     */
    public void addAppointment(Appointment appointment) {
        //TODO: Add implementation.
    }

    /**
     * Removes an existing appointment from the calendar
     * @param appointment Appointment to delete
     */
    public void removeAppointment(Appointment appointment) {
        //TODO: Add implementation.
    }

    /**
     * Remove all appointments from the calendar
     */
    public void clear() {
        //TODO: Add implementation.
    }

    /**
     * Returns a list of all the appointments that occur on a certain date.
     * @param year Year
     * @param month Month
     * @param day Day
     * @return List of appointments
     */
    public ArrayList<Appointment> getAppointments(int year, int month, int day) {
        return null; // TODO: Replace this line!

        //TODO: Add implementation.
    }

    /**
     * Get all appointments for a specific month
     * @param year Year
     * @param month Month
     * @return list of appointments
     */
    public ArrayList<Appointment> getAppointments(int year, int month) {
        return null; // TODO: Replace this line!

        //TODO: Add implementation.
    }

    /**
     * Get all appointments for a specific year.
     * @param year Year
     * @return list of appointments
     */
    public ArrayList<Appointment> getAppointments(int year) {
        return null; // TODO: Replace this line!

        //TODO: Add implementation.
    }

    /**
     * Bonus exercise
     * @param year Year
     * @param month Month
     */
    public void draw(int year, int month) {

    }

    /**
     * Shows an overview of all appointments in the calendar
     * @return String with all appointments
     */
    @Override
    public String toString() {
        // TODO: implement this method
        return "";
    }
}
