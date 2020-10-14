package com.springexample.demo;

public class Address {
    private String lane;
    private String city;
    public Address(){
        System.out.println("default");

    }
    public Address(String lane, String City){
        this.lane = lane;
        this.city = city;
    }
    public String getLane(){
        return lane;
    }
    public String getCity(){
        return city;
    }
    public void setLane(String lane){
        this.lane = lane;

    }
    public void setCity(String city){
        this.city = city;
    }
    public String toString(){

        return "location is" + city + lane+ ".";
    }





}
