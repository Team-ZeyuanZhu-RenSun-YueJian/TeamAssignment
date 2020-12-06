/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 25434
 */
public class Order {
    private int orderId;
    private static int counter=1;
    private String CarName;
    private String status;
    private String DriverName;
    private String DriverUserName;
    private String LesseeName;
    private int LesseeId;
    private int DriverId;
    private String  LesseeUserName;
    private Date startDate;
    private Date endDate;
    private String LesseeComment;

    public Order() {
        orderId = counter;
        ++counter;
    }
    
    public String getCarName() {
        return CarName;
    }

    public void setCarName(String CarName) {
        this.CarName = CarName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String DriverName) {
        this.DriverName = DriverName;
    }

    public String getDriverUserName() {
        return DriverUserName;
    }

    public void setDriverUserName(String DriverUserName) {
        this.DriverUserName = DriverUserName;
    }

    public String getLesseeName() {
        return LesseeName;
    }

    public void setLesseeName(String LesseeName) {
        this.LesseeName = LesseeName;
    }

    public int getLesseeId() {
        return LesseeId;
    }

    public void setLesseeId(int LesseeId) {
        this.LesseeId = LesseeId;
    }

    public int getDriverId() {
        return DriverId;
    }

    public void setDriverId(int DriverId) {
        this.DriverId = DriverId;
    }

    public String getLesseeUserName() {
        return LesseeUserName;
    }

    public void setLesseeUserName(String LesseeUserName) {
        this.LesseeUserName = LesseeUserName;
    }

    public String getLesseeComment() {
        return LesseeComment;
    }

    public void setLesseeComment(String LesseeComment) {
        this.LesseeComment = LesseeComment;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    
}
