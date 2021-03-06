package com.dh.hobbyist.place.model.vo;

import java.io.Serializable;
import java.sql.Date;

// 관리자 목록조회용 회사목록 (은석)
public class PlaceCompanyAndAdsList implements Serializable {
    int company_pk;
    String company_name;
    String phone;
    String address;
    String website;
    String intro;
    String service_time;
    String room_size;
    Date startDate;
    Date endDate;

    public PlaceCompanyAndAdsList() {
    }

    public PlaceCompanyAndAdsList(int company_pk, String company_name, String phone, String address,
                                  String website, String intro, String service_time, String room_size,
                                  Date startDate, Date endDate) {
        this.company_pk = company_pk;
        this.company_name = company_name;
        this.phone = phone;
        this.address = address;
        this.website = website;
        this.intro = intro;
        this.service_time = service_time;
        this.room_size = room_size;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "PlaceCompanyForList{" +
                "company_pk=" + company_pk +
                ", company_name='" + company_name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", website='" + website + '\'' +
                ", intro='" + intro + '\'' +
                ", service_time='" + service_time + '\'' +
                ", room_size='" + room_size + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public int getCompany_pk() {
        return company_pk;
    }

    public void setCompany_pk(int company_pk) {
        this.company_pk = company_pk;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getService_time() {
        return service_time;
    }

    public void setService_time(String service_time) {
        this.service_time = service_time;
    }

    public String getRoom_size() {
        return room_size;
    }

    public void setRoom_size(String room_size) {
        this.room_size = room_size;
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
