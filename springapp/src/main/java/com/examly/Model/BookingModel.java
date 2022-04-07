package com.examly.springapp.Model;

import java.util.Date;

public class BookingModel {
    public String bookingid;
    public UserModel clientDetail;
    public BeauticianDetail BeauticianModel;
    public String lawfirmName;
    public Date date;
    public Date time;
    public Boolean bookingStatus;
    public BookingModel(){

    }
    public BookingModel(String bookingid,UserModel clientDetail,BeauticianDetail BeauticianModel,String lawfirmName,Date date,Date time,Boolean bookingStatus,BookingModel){
        this.bookingid = bookingid;
        this.clientDetail = clientDetail;
        this.BeauticianModel=BeauticianModel;
        this.lawfirmName=lawfirmName;
        this.date=date;
        this.time=time;
        this.bookingStatus=bookingStatus;
    }
    public String getBookingid() {
        return this.bookingid;
    }

    public void setBookingid(String bookingid) {
        this.bookingid = bookingid;
    }

    public UserModel getClientDetail() {
        return this.clientDetail;
    }

    public void setClientDetail(UserModel clientDetail) {
        this.clientDetail = clientDetail;
    }

    public BeauticianDetail getBeauticianModel() {
        return this.BeauticianModel;
    }

    public void setBeauticianModel(BeauticianDetail BeauticianModel) {
        this.BeauticianModel = BeauticianModel;
    }

    public String getLawfirmName() {
        return this.lawfirmName;
    }

    public void setLawfirmName(String lawfirmName) {
        this.lawfirmName = lawfirmName;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return this.time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Boolean getBookingStatus() {
        return this.bookingStatus;
    }

    public void setBookingStatus(Boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

}
