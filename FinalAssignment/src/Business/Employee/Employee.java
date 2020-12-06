/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;
import Business.UserAccount.UserAccount;

/**
 *

 */
public class Employee {
    private String name;
    private int id;
    private static int count = 1;
    private UserAccount useraccount;
    private EmployeeDirectory employeeDirectory;

    public Employee() {
        id = count;
        count++;
        useraccount = new UserAccount();
        employeeDirectory = new EmployeeDirectory();
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }




    public UserAccount getAssistant() {
        return useraccount;
    }

    public void setAssistant(UserAccount assistant) {
        this.useraccount = useraccount;
    }

    public EmployeeDirectory getLawyerDirectory() {
        return employeeDirectory;
    }

    public void setLawyerDirectory(EmployeeDirectory lawyerDirectory) {
        this.employeeDirectory = lawyerDirectory;
    }

    @Override
    public String toString() {
        return name;
    }
}
