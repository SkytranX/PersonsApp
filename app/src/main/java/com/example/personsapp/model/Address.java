package com.example.personsapp.model;

public class Address {
    private double longitude;
    private double latitude;
    private String city;
    private String zip;
    private String country;
    private String streetAddress;

    public Address(double longitude, double latitude, String city, String zip, String country, String streetAddress ) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.streetAddress = streetAddress;
    }
    public double getLongitude() {return  longitude;}
    public  void  setLongitude(double longitude) { this.longitude = longitude;}

    public double getLatitude() {return  latitude;}
    public  void  setLatitude(double latitude) { this.latitude = latitude;}

    public String getCity() { return city;}
    public void setCity(String city) { this.city = city;}

    public String getZip() { return zip;}
    public void setZip(String zip) { this.zip = zip;}

    public String getCountry() { return country;}
    public void setCountry(String country) { this.country = country;}

    public String getStreetAddress() {return  streetAddress;}
    public  void  setStreetAddress(String streetAddress) {this.streetAddress = streetAddress;}


}
