/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public abstract class Menu <T> {
    private  String title ;
    private ArrayList<T> arraySlection;

    public Menu(String title, T [] mchon) {
        this.title = title;
        this.arraySlection = new ArrayList<>();
        for(T n : mchon)
        {
           arraySlection.add(n);
                    
        }
    }
    
    public abstract void execute( int choice);
    
    public void display()
    {
        System.out.println("========= "+title+" =========");
        for(int i = 0 ; i < arraySlection.size(); i++)
        {
            System.out.println((i+1)+". "+arraySlection.get(i));
        }
      
    }
    public int selected ()
    {
        while (true) {            
            display();
            System.out.println("Your choice: ");
         return new Scanner(System.in).nextInt();
        }
       
    }
    public void run()
    {
        do{
            int check = selected();
            if (check > arraySlection.size()) {
                break;
            }else{
                execute(check);
            }
        }while(true);
    }
}
