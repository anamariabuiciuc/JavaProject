package com.company;

public class Date{
    private int day;
    private int month;
    private int year;


  /*  public Date(int day, int month, int year )
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
*/

    public Date()
    {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public void displayDate() { System.out.println(day+"."+month+"."+year); }

    @Override
    public String toString() {
        return "Date{" +
                day +
                "." + month +
                "." + year +
                '}';
    }
}
