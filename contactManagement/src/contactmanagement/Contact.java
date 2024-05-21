/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactmanagement;

/**
 *
 * @author mac
 */
public class Contact {
    private static int lastId = 0;
    private int id;
    private String fullName,group,address,phone,lastName,firstName;
  
    public Contact( String firstName,String lastName, String group, String address, String phone) {
        this.id = ++lastId;
       this.firstName = firstName;
       this.lastName = lastName;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        
       return id;
       
    }
    
    public String getFullName() {
        
        return getFirstName()+ " " +getLastName();
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public String getGroup() {
        return group;
    }

    public String getAddress() {
        return address;
    }


    public String getPhone() {
       return phone;
    }

    
    public String getLastName() {
        return lastName;
    }

  

    public String getFirstName() {
        return firstName;
    }

  
    @Override
    public String toString() {
        return String.format("%-10d %-25s %-30s %-30s %-30s %-30s %-30s", getId(),
                getFullName(),getFirstName(),getLastName(),getGroup(),getAddress(),getPhone());
    }
    
    
}
