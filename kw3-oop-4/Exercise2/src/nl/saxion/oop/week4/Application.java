package nl.saxion.oop.week4;

import nl.saxion.app.SaxionApp;
import nl.saxion.oop.week4.model.Calendar;

import java.time.LocalDateTime;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 700, 600);
    }

    public void run() {
        Calendar calendar = new Calendar();

//        // Create some single appointments
//        calendar.addAppointment(new SingleAppointment(LocalDateTime.of(2021, 1, 10, 12, 15), "Visit the dentist"));
//        calendar.addAppointment(new SingleAppointment(LocalDateTime.of(2021, 1, 22, 9, 00), "Databases exam"));
//        calendar.addAppointment(new SingleAppointment(LocalDateTime.of(2021, 1, 20, 15, 00), "Retake Introduction to Programming"));
//
//        // Create some monthly appointments
//        calendar.addAppointment(new MonthlyAppointment(LocalDateTime.of(2021, 1, 25, 9, 00), "Receive student finance from DUO"));
//        calendar.addAppointment(new MonthlyAppointment(LocalDateTime.of(2021, 1, 1, 20, 00), "Cleaning student room"));
//
//        // Create some yearly appointments
//        calendar.addAppointment(new YearlyAppointment(LocalDateTime.of(2021, 1, 5, 9, 00), "Birthday mother"));
//        calendar.addAppointment(new YearlyAppointment(LocalDateTime.of(2021, 1, 1, 0, 00), "New year"));
//
//        // Bonus: draw a month calendar
//        calendar.draw(2021, 1);
    }
}
