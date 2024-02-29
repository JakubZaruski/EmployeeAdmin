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
}
