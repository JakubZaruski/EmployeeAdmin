
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jakubzaruski
 */
public class EmployeeTest {
    public static void main(String[] args){
        //3 Employee objects from the assigment
        Employee emp1 = new Employee("Joe", "Bloggs", "jb@gmail.com");
        Employee emp2 = new Employee("Ann", "Banana", "ab@gmail.com");
        Employee emp3 = new Employee("Tom", "Thumb", "tt@gmail.com");
        
        //An array called projectGroup and stores the 3 employees objects from above
        Employee[] projectGroup = {emp1, emp2, emp3};
        
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        //Sample employee emails
        String[] emails = {"jb@gmail.com", "ab@gmail.com", "tt@gmail.com"};
        
        for(String email : emails)
            if (Pattern.matches(emailRegex, email)){
                System.out.println(email + " is a valid email address.");
            }else{
                System.out.println(email + " is not a valid email address.");
            }
        
        //Print out variable nextEmpNum to the terminal window
        System.out.println("Available employee number:" + Employee.getNextEmpNumb());
        
        //Variable m 
        int m = 0;
        
        //Search and display the name of each of the employees
        //Array of employee number above the value stored in m
        System.out.println("Employees with Unique Employee Number greater than" + " " + m + ":");
        for (Employee emp : projectGroup){
            if(emp.getEmpNum()> m){
                //Showing full name firstName and lastName
                System.out.println(emp.toString());
            }
        }
    }
}
