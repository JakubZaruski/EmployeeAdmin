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
        
        //Print out variable nextEmpNum to the terminal window
        System.out.println("Available employee number:" + Employee.getNextEmpNumb());
        
        //Variable m 
        int m = 1;
        
    }
}
