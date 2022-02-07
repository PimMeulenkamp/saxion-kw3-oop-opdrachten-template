package nl.saxion.oop.week7.model;

import java.time.format.DateTimeFormatter;

public class Helpdesk {
    public static final DateTimeFormatter ticketFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

//    public int importData(String userFileName, String ticketFileName) throws HelpdeskException {
//        // TODO: implement me!
//    }


    /**
     * Login a user/employee
     *
     * @param username Username of the user/employee
     * @param password Password of the user/employee
     * @return True, if the user is logged on successfully
     */
    public boolean login(String username, String password) {
        // TODO: implement me!
        return false;
    }

    /**
     * Logout a user
     */
    public void logout() {
        // TODO: implement me!
    }

    /**
     * Returns true if the user is logged on
     *
     * @return True, if the user is logged on
     */
    public boolean isLoggedOn() {
        // TODO: implement me!
        return false;
    }

    /**
     * Returns true if the user is a troubleshooter, working for the helpdesk
     *
     * @return True, if the user is a troubleshooter
     */
    public boolean isTroubleshooter() {
        // TODO: implement me!
        return false;
    }

    /**
     * Add a hardwareticket to the helpdesk
     *
     * @param description description of the problem
     * @param machineCode Code of the computer
     */
    public int addHardwareTicket(String description, String machineCode) {
        // TODO: implement me!
        return -1;
    }

    /**
     * Add a softwareticket to the helpdesk
     *
     * @param description  description of the problem
     * @param softwareName Name of the piece of software
     */
    public int addSoftwareTicket(String description, String softwareName) {
        // TODO: implement me!
        return -1;
    }

    /**
     * Resolve a ticket
     *
     * @param ticketNumber Number of the ticket
     * @param response     Response text
     * @throws HelpdeskException When the ticket is not found, the current user is no employee or the ticket is already resolved
     */
//    public void resolveTicket(int ticketNumber, String response) throws HelpdeskException {
//        // TODO: implement me!
//    }

    /**
     * Get a ticket by its number
     *
     * @param ticketNumber Number of the ticket
     * @return Corresponding ticket object
     */
//    private Ticket findTicket(int ticketNumber) {
//        // TODO: implement me!
//        return null;
//    }

    /**
     * Print all my tickets
     */
    public void printMyTickets() {
        // TODO: implement me!
    }

    /**
     * Print all the open tickets in the system (only available for troubleshooters of the helpdesk)
     *
     * @throws HelpdeskException Exception is thrown when the user that is logged on has not enough privileges
     */
//    public void printOpenTickets() throws HelpdeskException {
//        // TODO: implement me!
//    }

    /**
     * Print all the tickets in the system (only available for troubleshooters of the helpdesk)
     *
     * @throws HelpdeskException Exception is thrown when the user that is logged on has not enough privileges
     */
//    public void printAllTickets() throws HelpdeskException {
//        // TODO: implement me!
//    }

    /**
     * Print all users in the system (only available for employees of the helpdesk)
     *
     * @throws HelpdeskException Exception is thrown when the user that is logged is not employee of the helpdesk
     */
//    public void printUsers() throws HelpdeskException {
//        // TODO: implement me!
//    }

}