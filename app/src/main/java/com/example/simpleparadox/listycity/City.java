package com.example.simpleparadox.listycity;

public class City implements Comparable<City>{
    private String city;
    private String province;
    private int pop;

    City(String city, String province){
        this.city = city;
        this.province = province;
        this.pop = 0;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    int getPop() { return this.pop; }

    @Override
    public int compareTo(City o) {
        return city.compareTo(o.getCityName());
    }
}
