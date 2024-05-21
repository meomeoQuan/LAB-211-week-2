/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manage.geographic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 *
 * @author mac
 */
public class ManageEastAsianCountries {
  
   public Stack<EastAsiaCountries> stack;

    public ManageEastAsianCountries() {
        this.stack = new Stack<>();
    }
    public void input ()
    {
        String countryCode = Utility.checkEmpty("Enter Code of country: ");
        String name = Utility.checkEmpty("Enter name of country:  ");
        float totalArea = Utility.inputFloat("Enter total Area: ");
        String terrain = Utility.checkEmpty("Enter terrain of country: ");
        EastAsiaCountries eac = new EastAsiaCountries(countryCode, name, totalArea, terrain);
        stack.push(eac);
    }
    
    public void display()
    {
           System.out.println(String.format("%-20s %-15s %-15s %-15s", "ID", "Name", "Total Area","Terrain"));
        EastAsiaCountries.display(stack);
    }
     public void displayAll() {
        if (stack.isEmpty()) {
            System.out.println("No countries to display.");
            return;
        }
        System.out.println(String.format("%-20s %-15s %-15s %-15s", "ID", "Name", "Total Area","Terrain"));
        for (EastAsiaCountries eac : stack) {
            System.out.println(eac);
        }
    }
      public void displayAllAscendingOrder() {
        if (stack.isEmpty()) {
            System.out.println("No countries to display.");
            return;
        }
        
        // Copy elements to an ArrayList
        ArrayList<EastAsiaCountries> list = new ArrayList<>(stack);
        
        // Sort the list
        Collections.sort(list);
        
        // Print the header
        System.out.println(String.format("%-20s %-15s %-15s %-15s", "ID", "Name", "Total Area", "Terrain"));
        
        // Print the sorted list
        for (EastAsiaCountries eac : list) {
            System.out.println(eac);
        }
    }
    public void searchByNameCountry(String findName)
    {
       EastAsiaCountries result = stack.stream().filter(c -> c.getCounntryName().equals(findName)).findFirst().orElse(null);
        if (result == null) {
            System.err.println("Don`t have any Country match !!!");
        }else{
            System.out.println(String.format("%-20s %-15s %-15s %-15s", "ID", "Name", "Total Area","Terrain"));
            System.out.println(result);
        }
    }
}
