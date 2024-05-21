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
public class EastAsiaCountries extends Country {
    private String countryTerrain;

    public EastAsiaCountries(String codeCountry, String nameCountry ,float areaCountry,String countryTerrain) {
        super(codeCountry,nameCountry,areaCountry);
        this.countryTerrain = countryTerrain;
    }
   
   public static <T> void display(Stack<T> n)
    {
        System.out.println(n.peek());
    }

   
  @Override
    public String toString() {
        return String.format("%-20s %-15s %-15.1f %-15s", countryCode, counntryName, totalArea,countryTerrain);
    }

    

    
}
