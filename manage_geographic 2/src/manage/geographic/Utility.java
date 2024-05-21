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
public class Utility {
    
    private static String nhap(String msg)
    {
        System.out.println(msg+"");
        return new Scanner(System.in).nextLine();
}
    public static String checkEmpty(String m)
    {
        while (true) {            
            String check = nhap(m);
            if(check.isEmpty() || check.length() == 0)
            {
                System.err.println("Empty input");
            }
           return check;
        }
        
    }
    public static float inputFloat(String m)
    {
        do{
            String check = nhap(m);
            if(check != null)
            {
                try {
                    float f = Float.parseFloat(check);
                      
                        if (f <= 0) {
                              System.err.println("Total area must be greater than 0 !");
                        }else{
                            return f;
                      
                    }
                    
                } catch (NumberFormatException e) {
                    System.err.println("Cannot be converted to Float !");
                }
            }
           
        }while(true);
    }
    public static int nhapSo (String s)
    {
        do{
            String check = checkEmpty(s);
            if (check != null) {
                try {
                    int i = Integer.parseInt(check);
                    if (i == 1 || i == 0) {
                        return i;
                    }else{
                        System.err.println("Just 1 or 0 !!! ");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Input must be number !");
                }
            }
        }while (true);            
            
        }
    }

