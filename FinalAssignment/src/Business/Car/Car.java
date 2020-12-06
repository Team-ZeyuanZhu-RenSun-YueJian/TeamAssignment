/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Car;

/**
 *
 * @author 25434
 */
public class Car {
    private String CarName;
    private String manufacturedate;
    private int seat;
    private String insurancedate;
    private String CityName;
    private int CarID;
    private static int counter=0;

    public enum Type{
        SUV("SUV"),
        Limo("Limo"),
        Truck("Truck"),
        Hatchback("hatchback");
        
        private String value;
        private Type(String value){
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
        
    public Car(String name ) {
        this.CarName = CarName;
        CarID = counter;
        ++counter;
        }



    public String getCarName() {
        return CarName;
    }

    public void setCarName(String CarName) {
        this.CarName = CarName;
    }

    public String getManufacturedate() {
        return manufacturedate;
    }

    public void setManufacturedate(String manufacturedate) {
        this.manufacturedate = manufacturedate;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getInsurancedate() {
        return insurancedate;
    }

    public void setInsurancedate(String insurancedate) {
        this.insurancedate = insurancedate;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }
    
 }

