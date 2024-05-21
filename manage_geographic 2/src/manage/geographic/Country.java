/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manage.geographic;


import java.util.Stack;

/**
 *
 * @author mac
 */
public class Country implements Comparable<Country>{
    protected String countryCode;
    protected String counntryName;
    protected float totalArea;

    public Country(String countryCode, String counntryName, float totalArea) {
        this.countryCode = countryCode;
        this.counntryName = counntryName;
        this.totalArea = totalArea;
    }

    public Country() {
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCounntryName() {
        return counntryName;
    }

    public float getTotalArea() {
        return totalArea;
    }    
    protected static <T> void display(Stack<T> n)
    {
        for(T c : n)
        {
            System.out.println(c+" ");
        }
    }

  @Override
    public String toString() {
        return String.format("%-20s %-15s %-15f", countryCode, counntryName, totalArea);
    }

   
    @Override
    public int compareTo(Country that) {
        return (this.getCounntryName().compareTo(that.getCounntryName())); 
        
        
    
    
}
    }
