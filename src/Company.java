
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
    //Company name and list of employees.
    private String companyName;
    private ArrayList<Employee> staff;
    
    //Default constructor for this class which initialises all fields.
    public Company() {
        this.companyName = "Default Company";
        this.staff = new ArrayList<>();
    }
    
    //Overloadded constructor allowing to name the company.
    public Company(String companyName){
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }
    
    //Add new employee to the staff list.
    public void addNewStaff(Employee employee) {
        staff.add(employee);
    }
    
    //Return the current number of employees.
    public int getStaffNumber() {
        return staff.size();
    }
    
    //List all employees with an employee number grater thand a specific value.
    public void listEmployees(int empNumThreshold) {
        Iterator<Employee> iterator = staff.iterator();
        while (iterator.hasNext()){
            Employee emp = iterator.next();
            if (emp.getEmpNum() > empNumThreshold) {
                System.out.println(emp);
            }
        }
    }

    public void removeStaff(int empNumToRemove) {
        staff.removeIf(emp -> emp.getEmpNum() == empNumToRemove); 
    }
    
    //Nested Manager class adding username and password.
    static class Manager extends Employee {
        private String username;
        private String password;
        
    //Construct for Manager.
        public Manager(String name, String email, String username, String password) {
            super(name, email);
            this.username = username;
            this.password = password;
        }
        
    //Getters and setters for username and password.
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
    
    //Console menu for manager operations.
    public static void managerConsole(Company company) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter username:");
       String username = scanner.nextLine();
       System.out.println("Enter password:");
       String password = scanner.nextLine();
    
    
    //Checks credentials; if valid, displays menu options.
        if ("Gnomeo".equals(username) && "smurf".equals(password)) {
            boolean running = true;
            while (running) {
                System.out.println("1. View Current Staff\n2. Add New Staff\n3. Remove Staff\n4.Exit");
                int choice = scanner.nextInt();
                scanner.nextLine(); 
                switch (choice) {
                    case 1: //Lists current staff.
                        System.out.println("Current Staff:");
                        company.listEmployees(0);
                        break;
                    case 2: //Adds a new staff member.
                        System.out.println("Enter Name:");
                        String name = scanner.nextLine();
                        System.out.println("Enter Email:");
                        String email = scanner.nextLine();
                        Employee newEmployee = new Employee(name, email);
                        company.addNewStaff(newEmployee);
                        System.out.println("New employee added.");
                        break;
                    case 3: //Remove Staff. 
                        System.out.println("Enter Employee Number to be Removed:");
                        int empNumToRemove = scanner.nextInt();
                        scanner.nextLine();
                        company.removeStaff(empNumToRemove);
                        System.out.println("Employee Removed.");
                        break; 
                    case 4: // Exits the loop.
                        running = false;
                        System.out.println("See You Later.");
                        break;
                }
            }
        } else {
            System.out.println("Invalid login.");
        }
    }
    
    
    //Github repository: 
    //Method to run the manager console.
    public static void main(String[] args) {
        Company company = new Company("Business Gnómes Ltd.");
        managerConsole(company);
    }

}
