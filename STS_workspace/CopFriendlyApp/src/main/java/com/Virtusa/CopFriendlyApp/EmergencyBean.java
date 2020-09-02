package com.Virtusa.CopFriendlyApp;

public class EmergencyBean {
	 
	 private String Name;
	 private String accidentType;
	 private String location ;
	 private String NoOfPeopleInjured ;
	 
	 public String getName() {
		 return Name;
	 }
	 public void setName(String Name) {
		 this.Name = Name;
	 }
	 public String getAccidentType() {
		 return accidentType;
	 }
	 public void setAccidentType(String accidentType) {
		 this.accidentType = accidentType;
	 }
	 public void setLocation(String location) {
		 this.location = location;
	 }
	 public String getLocation() {
		 return location;
	 }
	 public String getNoOfPeopleInjured() {
		 return NoOfPeopleInjured;
	 }
	 public void setNoOfPeopleInjured(String NoOfPeopleInjured) {
		 this.NoOfPeopleInjured = NoOfPeopleInjured;
	 }
	}