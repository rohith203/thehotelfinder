/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehotelfinder;

import java.util.Date;

/**
 *
 * @author Rohith
 */
public class Booking {
    String bookingRef; 
    User customer;
    Hotel hotel;
    Date checkInDate;
    Date checkOutDate;
    Date bookingDate;
    int noRoomsBooked[];
    double totalAmountPaid;

    public Booking(User customer, Hotel hotel, Date checkInDate, Date checkOutDate, int roomType, double roomCost) {
        this.customer = customer;
        this.hotel = hotel;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingDate = new Date();
        this.bookingRef = MyDate.getString(bookingDate);
    }
    
    
  
}
