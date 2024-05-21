/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactmanagement;

/**
 *
 * @author mac
 */
public class ContactMenu extends Menu<String>{
   private ContactList contactList ;
    public ContactMenu(String title, String[] mchon) {
        super(title, mchon);
      contactList = new ContactList();
    }

    @Override
    public void execute(int choice) {
        
        switch (choice) {
            case 1 -> {contactList.inputContact();}
             case 2 -> {contactList.displayAllContact();}
             case 3 -> {contactList.deleteContact();}
             case 4 -> {
                 System.out.println("Bye Quan We will meet again !");
                 System.exit(0);
             }
        } 
       
        
        
    }
    
    
}
