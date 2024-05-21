/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactmanagement;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Utility {
   private static String nhap(String msg)
    {
        System.out.println(msg+"");
        return new Scanner(System.in).nextLine();
    }
   
   public static String emptyCheck(String m)
   {
       do{
           String check = nhap(m);
           if (check.isEmpty() || check.length() == 0) {
               System.err.println("empty input !");
           }else{
               return check;
           }
       }while (true);                   
       
   }
   public static int idInput(String m)
   {
       while(true)
       {
           String check = emptyCheck(m);
           if(check != null)
           {
               try {
                   return Integer.parseInt(check);
               } catch (NumberFormatException e) {
                   System.err.println("ID is digit ");
               }
           }
       }
   }
   public static String validPhone (String m)
   {
       String PHONE_NUMBER_PATTERN =
            "^(\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}" + // Matches basic phone number
            "(?:\\s?(?:x|ext)\\s?\\d{2,5})?)$"; // Matches optional extensions

       do{
           String check = emptyCheck(m);
           boolean valid = check.matches(PHONE_NUMBER_PATTERN);
           if (valid) {
               return check;
           }else{
               System.out.println("Please input Phone flow\n" +
                                 "• 1234567890\n" +
                                 "• 123-456-7890\n" +
                                 "• 123-456-7890 x1234\n" +
                                 "• 123-456-7890 ext1234\n" +
                                 "• 123.456.7890\n" +
                                 "• 123 456 7890");
           }
                }while(true);
   }
}
