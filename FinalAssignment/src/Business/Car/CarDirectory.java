/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Car;

import Business.Car.Car.Type;
import java.util.ArrayList;

/**
 *
 * @author 25434
 */
public class CarDirectory {
    
    private ArrayList<Car> Cardetail;
    
    public CarDirectory() {
        this.Cardetail = new ArrayList<Car>();
       
    }


    public ArrayList<Car> getCardetail() {
        return Cardetail;
    }

    public void setCardetail(ArrayList<Car> Cardetail) {
        this.Cardetail = Cardetail;
    }
    
    public Car addCar(Type type){
        Car Carinfo = null;
        if (type.getValue().equals(Type.SUV.getValue())){
            Carinfo = new SUV();
            Cardetail.add(Carinfo);
        }
        else if (type.getValue().equals(Type.Truck.getValue())){
            Carinfo = new Truck();
            Cardetail.add(Carinfo);;
        }
        else if (type.getValue().equals(Type.Limo.getValue())){
            Carinfo = new Limo();
            Cardetail.add(Carinfo);
        }
             if (type.getValue().equals(Type.Hatchback.getValue())){
            Carinfo = new Hatchback();
            Cardetail.add(Carinfo);
        }
        
        return Carinfo;
    }
}
