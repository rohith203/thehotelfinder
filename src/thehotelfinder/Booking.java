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
    int roomType;
    double roomCost;

    public Booking(User customer, Hotel hotel, Date checkInDate, Date checkOutDate, int roomType, double roomCost) {
        this.customer = customer;
        this.hotel = hotel;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomType = roomType;
        this.roomCost = roomCost;
        this.bookingDate = new Date();
        this.bookingRef = bookingDate.toString();
    }

    public String getBookingRef() {
        return bookingRef;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public double getRoomCost() {
        return roomCost;
    }

    public void setRoomCost(double roomCost) {
        this.roomCost = roomCost;
    }
    
    
   
    
}
