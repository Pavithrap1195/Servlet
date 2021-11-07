package com.xworkz.registrationform;

public class DatabaseDTO {

	private String sportsName;
	private String fullName;
	private String mobileNumber;
	private String dateAndTime;
	private String gender;
	private String ageGroup;

	public DatabaseDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getSportsName() {
		return sportsName;
	}

	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public DatabaseDTO(String sportsName, String fullName, String mobileNumber, String dateAndTime, String gender,
			String ageGroup) {
		super();
		this.sportsName = sportsName;
		this.fullName = fullName;
		this.mobileNumber = mobileNumber;
		this.dateAndTime = dateAndTime;
		this.gender = gender;
		this.ageGroup = ageGroup;
	}

	@Override
	public String toString() {
		return "DatabaseDTO [sportsName=" + sportsName + ", fullName=" + fullName + ", mobileNumber=" + mobileNumber
				+ ", dateAndTime=" + dateAndTime + ", gender=" + gender + ", ageGroup=" + ageGroup + "]";
	}

	
}
