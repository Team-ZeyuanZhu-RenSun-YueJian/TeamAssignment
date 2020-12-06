/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author 25434
 */
public abstract class Organization {
    private String name;
    private int organizationID;
    private static int counter=0;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    
    public enum Type{
        Admin("Admin Organization"), 
        Customer("Customer Organization"), 
        CarrentCompany("CarRent Company Organization"), 
        Driver("Driver Organization"),
        Outsourcingcompany("OutSourcing Company Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
     }
    public Organization(String name) {
        this.name = name;
        organizationID = counter;
        ++counter;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory(); 
    }
    
    //public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
