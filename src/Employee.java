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
        this.email = email;
        this.empNum = nextEmpNum++;
    }
}
