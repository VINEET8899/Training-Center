package com.training.center.request;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class TrainingCenterCreateRequest {

	@NotBlank(message = "Center Name cannot be blank")
	@Size(max = 40, message = "Center Name must be of less than 40 characters")
	private String centerName;

	@NotBlank(message = "Center code is mandatory")
	@Size(max = 12, message = "Center code must be of exactly 12 characters")
	private String centerCode;

	@NotBlank(message = "Email is required")
	@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", message = "Invalid email format")
	private String email;

	@NotBlank(message = "Phone number is required")
	@Pattern(regexp = "^\\d{10}$", message = "Invalid phone no.It should be a 10 digit no")
	private String phone;

	private AddressRequest address;
	private long studentCapacity;
	private List<String> courses;

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterCode() {
		return centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public AddressRequest getAddress() {
		return address;
	}

	public void setAddress(AddressRequest address) {
		this.address = address;
	}

	public long getStudentCapacity() {
		return studentCapacity;
	}

	public void setStudentCapacity(long studentCapacity) {
		this.studentCapacity = studentCapacity;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

//	public String validateData() {
//		if(centerName == null)
//			return "Center name is mandatory";
//		if(centerCode == null)
//			return "Center code is mandatory";
//		if(email == null)
//			return "Center code is mandatory";
//		if(address == null)
//			return "Address is mandatory";
//		if(!Utils.isValidEmail(email)) 
//			return "Email is not valid";
//		if(!Utils.isValidPhone(phone)) 
//			return "Phone is not valid";
//		return null;
//	}
}
