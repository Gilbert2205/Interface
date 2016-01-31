package com.company;

/**
 * Created by uitschool JV on 1/31/2016.
 */
public class Offices {
    private String Name;
    private int staff;
    private City city;

    public Offices(String name, int staff, City city) {
        Name = name;
        this.staff = staff;
        this.city = city;
    }

    public String getName() {
        return Name;
    }

    public int getStaff() {
        return staff;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Offices{" +
                "Name='" + Name + '\'' +
                ", staff=" + staff +
                ", city=" + city +
                '}';
    }
}


