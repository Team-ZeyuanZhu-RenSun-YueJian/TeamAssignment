/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

/**
 *
 * @author 25434
 */
public class Role {
    private String name;
    
     public enum RoleType{
        Admin("Admin"), 
        Customer("Customer"), 
        CarrentCompany("CarRent Company"), 
        Driver("Driver"),
        Outsourcingcompany("OutSourcing Company");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
     }
     
    public Role(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
