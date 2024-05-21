/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manage.geographic;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class MenuEastAsianCountry extends Menu<String>{

     private ManageEastAsianCountries manageEastAsianCountries;


     public MenuEastAsianCountry(String title, String[] mchon, ManageEastAsianCountries manageEastAsianCountries) {
        super(title, mchon);
        this.manageEastAsianCountries = manageEastAsianCountries;
    }

    @Override
    public void execute(int chon) {
        
       switch(chon)
       {
           case 1 -> {
             
               int continueFlag;
                do {
                    manageEastAsianCountries.input();
                    System.out.println("Do you want to continue?");
                    continueFlag = Utility.nhapSo("Press 1 for continuing || Press 0 for quitting ");
                } while (continueFlag == 1);

               
           }
               case 2 ->{
                   manageEastAsianCountries.display();
               }
                   case 3 ->{
                       System.out.println("Enter Country want to find : ");
                       String find = new Scanner(System.in).nextLine();
                      manageEastAsianCountries.searchByNameCountry(find);
                   }
                   case 4 -> {
                       
                     
                      manageEastAsianCountries.displayAllAscendingOrder();
                   }
                   case 5 ->
                   {
                       System.out.println("Good Bye Quan !");
                       System.exit(0);
                   }
                   default ->
                   {
                       System.err.println("Please enter valid choice range ! ");
                   }
       
    }
    
    
}
}
