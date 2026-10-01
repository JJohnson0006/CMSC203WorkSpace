/*
 * Class: CMSC203 CRN 20798
 * Instructor: Dr. Ahmed Tarek
 * Description: The Procedure class represents a medical procedure that
 *              was performed on a patient. It stores the procedure name,
 *              the date, the practitioner's name, and the charges. It has
 *              three constructors, a getter and setter for every field,
 *              and a toString method that shows all of the procedure's info.
 * Due: 09/30/2026
 * Platform/compiler: Eclipse IDE / Java JDK 26 / Mac OS
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 * Print your Name here: Javier Johnson
 */

/**
 * This class represents a medical procedure done on a patient.
 */
public class Procedure {

	private String procedureName;     // name of the procedure
	private String procedureDate;     // date of the procedure (example 06/12/2023)
	private String practitionerName;  // who performed the procedure
	private double charges;           // how much the procedure costs

	/**
	 * No-arg constructor. Sets the Strings to empty and
	 * the charges to 0.0.
	 */
	public Procedure() {
		procedureName = "";
		procedureDate = "";
		practitionerName = "";
		charges = 0.0;
	}

	/**
	 * Constructor that sets the procedure's name and date.
	 * The practitioner is set to empty and charges to 0.0.
	 *
	 */
	public Procedure(String name, String date) {
		procedureName = name;
		procedureDate = date;
		practitionerName = "";
		charges = 0.0;
	}

	/**
	 * Constructor that sets all of the procedure's fields.
	 *
	 */
	public Procedure(String name, String date, String practitioner, double cost) {
		procedureName = name;
		procedureDate = date;
		practitionerName = practitioner;
		charges = cost;
	}

	//  getters

	/**
	 * Gets the name of the procedure.
	 *
	 */
	public String getProcedureName() {
		return procedureName;
	}

	/**
	 * Gets the date of the procedure.
	 *
	 */
	public String getProcedureDate() {
		return procedureDate;
	}

	/**
	 * Gets the name of the practitioner.
	 *
	 */
	public String getPractitionerName() {
		return practitionerName;
	}

	/**
	 * Gets the charges for the procedure.
	 *
	 */
	public double getCharges() {
		return charges;
	}

	// (setters) 

	/**
	 * Sets the name of the procedure.
	 *
	 */
	public void setProcedureName(String name) {
		procedureName = name;
	}

	/**
	 * Sets the date of the procedure.
	 *
	 */
	public void setProcedureDate(String date) {
		procedureDate = date;
	}

	/**
	 * Sets the name of the practitioner.
	 *
	 */
	public void setPractitionerName(String practitioner) {
		practitionerName = practitioner;
	}

	/**
	 * Sets the charges for the procedure.
	 *
	 */
	public void setCharges(double cost) {
		charges = cost;
	}

	/**
	 * Returns all of the procedure's information as one String.
	 * Each line starts with a tab.
	 */
	public String toString() {
		String info = "\tProcedure: " + procedureName + "\n";
		info = info + "\tProcedureDate=" + procedureDate + "\n";
		info = info + "\tPractitioner=" + practitionerName + "\n";
		info = info + "\tCharge=" + charges;
		return info;
	}
}
