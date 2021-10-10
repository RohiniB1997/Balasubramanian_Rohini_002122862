/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author rohinibalasubramanian
 */
public class Cars {
    
    private String passengerCar;
    private String carcompany;
    private String year;
    private int serial_no;
    private String city;
    private String availability;
    private String ubertype;
    private String seats;
    private Date date;
    private String Maintenance;

    public String getMaintenance() {
        return Maintenance;
    }

    public void setMaintenance(String Maintenance) {
        this.Maintenance = Maintenance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    

   

    public String getUbertype() {
        return ubertype;
    }

    public void setUbertype(String ubertype) {
        this.ubertype = ubertype;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
   

    public String getPassengerCar() {
        return passengerCar;
    }

    public void setPassengerCar(String passengerCar) {
        this.passengerCar = passengerCar;
    }

    public String getCarcompany() {
        return carcompany;
    }

    public void setCarcompany(String carcompany) {
        this.carcompany = carcompany;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(int serial_no) {
        this.serial_no = serial_no;
    }

    

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
     @Override
    public String toString()
    {
        return carcompany;
    }
    
   
}
