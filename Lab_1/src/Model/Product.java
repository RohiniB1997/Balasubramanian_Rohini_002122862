/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import java.text.DateFormat;


/**
 *
 * @author rohinibalasubramanian
 */
public class Product {
    
    public String name; 
    private String country;
    
    private String telNum; 
    private String emailAd;
    private String fax;
    private String ssn;
    private String medRec;
    private String healthPlan;
    private String bankAcc;
    private String licenseNum;
    private String vehIden;
    private String devIden;
    private String linkedIn;
    private String intProt;
    private String path;
    private Date dob;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getEmailAd() {
        return emailAd;
    }

    public void setEmailAd(String emailAd) {
        this.emailAd = emailAd;
    }
    
    public void setfax(String fax){
        this.fax= fax;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getMedRec() {
        return medRec;
    }

    public void setMedRec(String medRec) {
        this.medRec = medRec;
    }

    public String getHealthPlan() {
        return healthPlan;
    }

    public void setHealthPlan(String healthPlan) {
        this.healthPlan = healthPlan;
    }

    public String getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(String bankAcc) {
        this.bankAcc = bankAcc;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getVehIden() {
        return vehIden;
    }

    public void setVehIden(String vehIden) {
        this.vehIden = vehIden;
    }

    public String getDevIden() {
        return devIden;
    }

    public void setDevIden(String devIden) {
        this.devIden = devIden;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getIntProt() {
        return intProt;
    }

    public void setIntProt(String intProt) {
        this.intProt = intProt;
    }
    
    
    
    
}
