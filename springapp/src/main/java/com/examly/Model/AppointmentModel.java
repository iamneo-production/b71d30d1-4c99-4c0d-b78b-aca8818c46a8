package com.examly.springapp.Model;

import java.util.Date;
import java.util.List;

public class AppointmentModel {
    public String AppointmentID;
    public UserModel userid;
    public Date date;
    public List<String> description;
    public UserModel issuedBy;
    public AppointmentModel(){

    }
    public AppointmentModel(String AppointmentID,UserModel userid,Date date,List<String> description,UserModel issuedBy){
        this.AppointmentID = AppointmentID;
        this.userid = userid;
        this.date=date;
        this.description=description;
        this.issuedBy=issuedBy;
    }
    public String getAppointmentID() {
        return this.AppointmentID;
    }

    public void setAppointmentID(String AppointmentID) {
        this.AppointmentID = AppointmentID;
    }

    public UserModel getUserid() {
        return this.userid;
    }

    public void setUserid(UserModel userid) {
        this.userid = userid;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getDescription() {
        return this.description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public UserModel getIssuedBy() {
        return this.issuedBy;
    }

    public void setIssuedBy(UserModel issuedBy) {
        this.issuedBy = issuedBy;
    }
    
    
    

}
