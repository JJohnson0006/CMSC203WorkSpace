/*
 * Class: CMSC203 CRN 20798
 * Instructor: Dr. Ahmed Tarek
 * Description: The Patient class stores a patient's name, address,
 *              phone number, and emergency contact information. It has
 *              three constructors, a getter and setter for every field,
 *              build methods that put pieces of information together,
 *              and a toString method that shows all of the patient's info.
 * Due: 09/30/2026
 * Platform/compiler: Eclipse IDE / Java JDK 26 / Mac OS
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 * Print your Name here: Javier Johnson
 */

/**
 * This class represents a patient. It holds the patient's name,
 * address, phone number, and emergency contact.
 */
public class Patient {

	// Patient name fields
	private String firstName;
	private String middleName;
	private String lastName;

	// Patient address fields
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;

	// Patient phone number (example 301-123-4567)
	private String phoneNumber;

	// Emergency contact fields
	private String emergencyContactName;
	private String emergencyContactPhone;

	/**
	 * No-arg constructor. Sets every field to an empty String
	 * so nothing is left as null.
	 */
	public Patient() {
		firstName = "";
		middleName = "";
		lastName = "";
		streetAddress = "";
		city = "";
		state = "";
		zipCode = "";
		phoneNumber = "";
		emergencyContactName = "";
		emergencyContactPhone = "";
	}

	/**
	 * Constructor that sets the patient's first, middle, and last name.
	 * The other fields are set to empty Strings.
	 */
	public Patient(String first, String middle, String last) {
		firstName = first;
		middleName = middle;
		lastName = last;
		streetAddress = "";
		city = "";
		state = "";
		zipCode = "";
		phoneNumber = "";
		emergencyContactName = "";
		emergencyContactPhone = "";
	}

	/**
	 * Constructor that sets all of the patient's fields.
	 *
	 */
	public Patient(String first, String middle, String last, String address,
			String cityName, String st, String zip, String phone,
			String emerName, String emerPhone) {
		firstName = first;
		middleName = middle;
		lastName = last;
		streetAddress = address;
		city = cityName;
		state = st;
		zipCode = zip;
		phoneNumber = phone;
		emergencyContactName = emerName;
		emergencyContactPhone = emerPhone;
	}

	// (getters) 
	/**
	 * Gets the patient's first name.
	 *
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Gets the patient's middle name.
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Gets the patient's last name.
	 *
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Gets the patient's street address.
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * Gets the patient's city.
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Gets the patient's state.
	 */
	public String getState() {
		return state;
	}

	/**
	 * Gets the patient's ZIP code.
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * Gets the patient's phone number.
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Gets the emergency contact's name.
	 */
	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	/**
	 * Gets the emergency contact's phone number.
	 */
	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}

	// (setters) 

	/**
	 * Sets the patient's first name.
	 */
	public void setFirstName(String first) {
		firstName = first;
	}

	/**
	 * Sets the patient's middle name.
	 */
	public void setMiddleName(String middle) {
		middleName = middle;
	}

	/**
	 * Sets the patient's last name.
	 */
	public void setLastName(String last) {
		lastName = last;
	}

	/**
	 * Sets the patient's street address.
	 */
	public void setStreetAddress(String address) {
		streetAddress = address;
	}

	/**
	 * Sets the patient's city.
	 */
	public void setCity(String cityName) {
		city = cityName;
	}

	/**
	 * Sets the patient's state.
	 */
	public void setState(String st) {
		state = st;
	}

	/**
	 * Sets the patient's ZIP code.
	 */
	public void setZipCode(String zip) {
		zipCode = zip;
	}

	/**
	 * Sets the patient's phone number.
	 */
	public void setPhoneNumber(String phone) {
		phoneNumber = phone;
	}

	/**
	 * Sets the emergency contact's name.
	 */
	public void setEmergencyContactName(String emerName) {
		emergencyContactName = emerName;
	}

	/**
	 * Sets the emergency contact's phone number.
	 */
	public void setEmergencyContactPhone(String emerPhone) {
		emergencyContactPhone = emerPhone;
	}

	// methods 

	/**
	 * Puts the first, middle, and last name together with a space
	 * between each one.
	 */
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}

	/**
	 * Puts the street address, city, state, and ZIP code together
	 * with a space between each one.
	
	 */
	public String buildAddress() {
		return streetAddress + " " + city + " " + state + " " + zipCode;
	}

	/**
	 * Puts the emergency contact's name and phone number together
	 * with a space between them.
	 */
	public String buildEmergencyContact() {
		return emergencyContactName + " " + emergencyContactPhone;
	}

	/**
	 * Returns all of the patient's information as one String.
	 * It uses the three build methods above.
	 */
	public String toString() {
		String info = "Patient info:\n";
		info = info + "  Name: " + buildFullName() + "\n";
		info = info + "  Address: " + buildAddress() + "\n";
		info = info + "  Phone: " + phoneNumber + "\n";
		info = info + "  EmergencyContact: " + buildEmergencyContact();
		return info;
	}
}
