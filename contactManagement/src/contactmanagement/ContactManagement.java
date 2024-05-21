/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contactmanagement;

/**
 *
 * @author mac
 */
public class ContactManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String [] mchon = {"Add a Contact","Display all Contact","Delete a Contact","Exit"};
       Menu<String> menu = new ContactMenu("Contact program", mchon);
       menu.run();
    }
    
}
