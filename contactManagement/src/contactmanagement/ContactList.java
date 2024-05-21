/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactmanagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 */
public class ContactList {
    public  List<Contact> listContact;

    public ContactList() {
        this.listContact = new ArrayList<>();
    }
    public void inputContact()
    {
        System.out.println("-------- Add a Contact --------");
        String firstName = Utility.emptyCheck("Enter First Name : ");
        String lastName = Utility.emptyCheck("Enter Last Name: ");
        String group = Utility.emptyCheck("Enter Group: ");
        String address = Utility.emptyCheck("Enter Address: ");
        String phone = Utility.validPhone("Enter Phone: ");
        
        Contact contact = new Contact(firstName, lastName, group, address, phone);
        listContact.add(contact);
        System.out.println("Successful");
    }
    public void displayAllContact()
    {
        System.out.println("---------------------------------------------------------------------------------- Display all Contact ----------------------------------------------------------------------");
        System.out.println("");
        System.out.printf("%-10s %-25s %-30s %-30s %-30s %-30s %-30s\n","ID","Name","First Name","Last Name","Group","Address","Phone");
        if(listContact.isEmpty())
        {
            System.out.println("Empty List");
        }else{
        listContact.forEach(c -> System.out.println(c.toString()));
    }
    }
    public void deleteContact ()
    {
        System.out.println("------- Delete a Contact -------");
        int id = Utility.idInput("Enter ID : ");
        boolean find = listContact.removeIf(c -> (c.getId() == id));
        if (find) {
            System.out.println("Successful");
            reassignIds();
        }else{
            System.out.println("Can`t found ID: "+id);
        }
    }
    
     // Method to reassign IDs
    private  void reassignIds() {
        int currentId = 1;
        for (Contact contact : listContact) {
            contact.setId(currentId++);
        }
    }
    
}
