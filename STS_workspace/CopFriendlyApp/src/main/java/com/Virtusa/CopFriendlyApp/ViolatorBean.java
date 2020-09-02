package com.Virtusa.CopFriendlyApp;

public class ViolatorBean {
	 
	 private String Name;
	 private String violationType;
	 private String vehicleNumber ;
	 private String DrivingLicense ;
	 private String vehicleType ;
	 private String date;
	 private String location;
	 private String fine;
	 
	 public String getName() {
		 return Name;
	 }
	 public void setName(String Name) {
		 this.Name = Name;
	 }
	 public String getviolationType() {
		 return violationType;
	 }
	 public void setviolationType(String violationType) {
		 this.violationType = violationType;
	 }
	 public void setvehicleNumber(String vehicleNumber) {
		 this.vehicleNumber = vehicleNumber;
	 }
	 public String getvehicleNumber() {
		 return vehicleNumber;
	 }
	 public void setDrivingLicense(String DrivingLicense) {
		 this.DrivingLicense = DrivingLicense;
	 }
	 public String getDrivingLicense() {
		 return DrivingLicense;
	 }
	 public String getvehicleType() {
		 return vehicleType;
	 }
	 public void setvehicleType(String vehicleType) {
		 this.vehicleType = vehicleType;
	 }
	 public String getdate() {
		 return date;
	 }
	 public void setdate(String date) {
		 this.date = date;
	 }
	 
	 public String getlocation() {
		 return location;
	 }
	 public void setlocation(String location) {
		 this.location = location;
	 }
	 public String getfine() {
		 return fine;
	 }
	 public void setfine(String fine) {
		 this.fine = fine;
	 }
	}