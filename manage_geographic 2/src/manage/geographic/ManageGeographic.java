/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manage.geographic;

/**
 *
 * @author mac
 */
public class ManageGeographic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] mchon = {"Input the information of countries in East Asia","Display the information of country you've just input","Search the information of country by user-entered name","Display the information of countries sorted name in ascending order ","Exit"};
        ManageEastAsianCountries manageEastAsianCountries = new ManageEastAsianCountries();
     Menu<String> menu = new MenuEastAsianCountry("MENU",mchon,manageEastAsianCountries);
     menu.run();
      
    }
    
}
