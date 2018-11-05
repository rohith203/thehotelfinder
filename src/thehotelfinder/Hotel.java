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
    String address[];
    ArrayList nRoomsArr;
    ArrayList costArr;
    double rating;
    ArrayList hotelDetails;
    ArrayList waitingList;
    
    public Hotel(String name, String[] address, ArrayList nRoomsArr, ArrayList costArr, double rating, ArrayList hotelDetails, ArrayList waitingList) {
        this.name = name;
        this.address = address;
        this.nRoomsArr = nRoomsArr;
        this.costArr = costArr;
        this.rating = rating;
        this.hotelDetails = hotelDetails;
        this.waitingList = waitingList;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public ArrayList getnRoomsArr() {
        return nRoomsArr;
    }

    public void setnRoomsArr(ArrayList nRoomsArr) {
        this.nRoomsArr = nRoomsArr;
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
