
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jakubzaruski
 */
public class Employee{
     //private class with all of the employee information that is required
    private int empNum;
    private String firstName;
    private String lastName;
    private String email;
    
    //Static field to keep track of employee's number
    private static int nextEmpNum = 1;
    
    //Constructor without parameters, initializes Employee object with default values
    public Employee(){
        this.firstName = "Default";
        this.lastName = "Name";
        this.email = "deafault@example.com";
        this.empNum = nextEmpNum++;
    }
        
    //Construct with parameters to set custom name
    public Employee(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.empNum = nextEmpNum++;
    }

    Employee(String name, String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //Accessor method for first name
    public String getFirstName(){
        return firstName;
    }
    
    //Accessor method for last name
    public String getLastName(){
        return firstName;
    }
    
    //Accessor method for email
    public String getEmail(){
        return email;
    }
    
    //Accessor method for employee unique number
    public int getEmpNum(){
        return empNum;
    }
    
    //Set a new email if it matches valid email pattern as specified in the assigment
    public void setEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    //Check if email matches the pattern
    if(Pattern.matches(emailRegex, email)){
        this.email = email;
    }else{
        System.out.println("Invalid email format. Hence email not updated.");
    }
    }
    //Static method to get next employee number
    public static int getNextEmpNumb(){
        return nextEmpNum;
    }
    
    //@Override to display names in correct format

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return firstName + " " + lastName + " ("+ email +"), Employee Number:"+ empNum;
    }
            
    
   
}
