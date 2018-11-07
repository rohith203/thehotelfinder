/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehotelfinder;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Rohith
 */
public class Hotel {
    String name;
    String city;
    String state;
    ArrayList noRoomsArr;
    ArrayList costArr;
    double rating;
    ArrayList hotelDetails;
    ArrayList waitingList;

    public Hotel(String name, String city, String state) {
        this.name = name;
        this.city = city;
        this.state = state;
//        this.rating = rating;
//        this.hotelDetails = hotelDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ArrayList getNoRoomsArr() {
        return noRoomsArr;
    }

    public void setNoRoomsArr(ArrayList noRoomsArr) {
        this.noRoomsArr = noRoomsArr;
    }

    public ArrayList getCostArr() {
        return costArr;
    }

    public void setCostArr(ArrayList costArr) {
        this.costArr = costArr;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList getHotelDetails() {
        return hotelDetails;
    }

    public void setHotelDetails(ArrayList hotelDetails) {
        this.hotelDetails = hotelDetails;
    }

    public ArrayList getWaitingList() {
        return waitingList;
    }

    public void setWaitingList(ArrayList waitingList) {
        this.waitingList = waitingList;
    }
    
}
