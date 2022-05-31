package com.herokuapp.restful_booke.model;


import java.util.HashMap;

/**
 * Created by Jay Vaghani
 */
public class BookerPojo {

    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    private String lastname;

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public Boolean getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public HashMap<Object, Object> getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(HashMap<Object, Object> bookingdates) {
        this.bookingdates = bookingdates;
    }

    private int totalprice;
    private Boolean depositpaid;

    public String getAdditionalneeds() {
        return Additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        Additionalneeds = additionalneeds;
    }

    private  String  Additionalneeds;
    private HashMap<Object,Object> bookingdates;


}

