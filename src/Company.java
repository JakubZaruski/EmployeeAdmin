
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jakubzaruski
 */
public class Company {
    //Company name and list of employees
    private String companyName;
    private ArrayList<Employee> staff;
    
    //Default constructor for this class which initialises all fields
    public Company() {
        this.companyName = "Default Company";
        this.staff = new ArrayList<>();
    }
    
    //Overloadded constructor allowing to name the company
    public Company(String companyName){
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }
    
    //Add new employee to the staff list
    public void addNewStaff(Employee employee) {
        staff.add(employee);
    }
    
    //Return the current number of employees
    public int getStaffNumber() {
        return staff.size();
    }
    
    //List all employees with an employee number grater thand a specific value
    public void listEmployees(int empNumThreshold) {
        Iterator<Employee> iterator = staff.iterator();
        while (iterator.hasNext()){
            Employee emp = iterator.next();
            if (emp.getEmpNum() > empNumThreshold) {
                System.out.println(emp);
            }
        }
    }
    
    //Nested Manager class adding username and password
    static class Manager extends Employee {
        private String username;
        private String password;
        
    //Construct for Manager
        public Manager(String name, String email, String username, String password) {
            super(name, email);
            this.username = username;
            this.password = password;
        }
        
    //Getters and setters for username and password
    public String getUsername() {
        return username;
    }    
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    }
    
    //Console menu for manager operations
    public static void managerConsole(Company company) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter username:");
       String username = scanner.nextLine();
       System.out.println("Enter password:");
       String password = scanner.nextLine();
    }
    
    //Checks username/password if valid displays menu options
    if("Gnomeo" .equals(username)) && "smurf" .equals(password)) {
       boolean running = true;
    }
            
}
