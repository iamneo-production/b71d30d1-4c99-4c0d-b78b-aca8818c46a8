package com.examly.springapp.Model;

import java.util.Date;
import java.util.List;

public class ReportModel {
    public UserModel AppointmentDetail;
    public Date date;
    public String amount;
    public String report;
    public UserModel issuedBy;

    public ReportModel(){

    }
    public ReportModel(UserModel AppointmentDetail,Date date,String amount,String report,UserModel issuedBy){
        this.AppointmentDetail = AppointmentDetail;
        this.date = date;
        this.amount=amount;
        this.report=report;
        this.issuedBy=issuedBy;
    }

    public UserModel getAppointmentDetail() {
        return this.AppointmentDetail;
    }

    public void setAppointmentDetail(UserModel AppointmentDetail) {
        this.AppointmentDetail = AppointmentDetail;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getReport() {
        return this.report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public UserModel getIssuedBy() {
        return this.issuedBy;
    }

    public void setIssuedBy(UserModel issuedBy) {
        this.issuedBy = issuedBy;
    }
    
}
