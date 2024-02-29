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
           
}
