package assignment2.Entities;

import java.time.LocalDate;

public class Customer{
	private int Id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String NationalityID;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, LocalDate  dateOfBirth, String nationalityID) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		NationalityID = nationalityID;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate  getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate  dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityID() {
		return NationalityID;
	}

	public void setNationalityID(String nationalityID) {
		NationalityID = nationalityID;
	}
	
	
	

}
