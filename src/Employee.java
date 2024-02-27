
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
    private String name;
    private String email;
    
    //Static field to keep track of employee's number
    private static int nextEmpNum = 1;
    
    //Constructor without parameters, initializes Employee object with default values
    public Employee(){
        this.name = "Default Name";
        this.email = "deafault@example.com";
        this.empNum = nextEmpNum++;
    }
        
    //Construct with parameters to set custom name
    public Employee(String name, String email){
        this.name = name;
        setEmail(email);
        this.empNum = nextEmpNum++;
    }
    
    //Accessor method for name
    public String getName(){
        return name;
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
}
