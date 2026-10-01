/*
 * Class: CMSC203 CRN 20798
 * Instructor: Dr. Ahmed Tarek
 * Description: PatientDriverApp is the driver class. It asks the user to
 *              type in a patient's information and the information for
 *              three procedures. It creates one Patient object and three
 *              Procedure objects (one with each Procedure constructor),
 *              displays all of the information, and then displays the
 *              total charges of the three procedures.
 * Due: 9/30/2026
 * Platform/compiler: Eclipse IDE / Java JDK 26 / Mac OS
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 * Print your Name here: Javier Johnson
 */

import java.util.Scanner;

/**
 * Driver class that creates a Patient and three Procedures from
 * keyboard input and displays their information and total charges.
 */
public class PatientDriverApp {

	// Change these two lines to your own name and date
	public static final String programmerName = "Javier Johnson";
	public static final String programDate = "9/30/2026";

	/**
	 * The main method. It reads the patient and procedure information
	 * from the keyboard, creates the objects, and displays everything.
	 */
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		// Variables to hold the patient information
		String first, middle, last;
		String address, city, state, zip;
		String phone, emerName, emerPhone;

		// Variables to hold the procedure information
		String procName, procDate, practitioner;
		double procCharge;

		// ---------- Get the patient information ----------
		System.out.println("Enter the Patient Information");
		System.out.println("-----------------------------");

		System.out.print("First name: ");
		first = keyboard.nextLine();

		System.out.print("Middle name: ");
		middle = keyboard.nextLine();

		System.out.print("Last name: ");
		last = keyboard.nextLine();

		System.out.print("Street address: ");
		address = keyboard.nextLine();

		System.out.print("City: ");
		city = keyboard.nextLine();

		System.out.print("State: ");
		state = keyboard.nextLine();

		System.out.print("ZIP code: ");
		zip = keyboard.nextLine();

		System.out.print("Phone number (example 301-123-4567): ");
		phone = keyboard.nextLine();

		System.out.print("Emergency contact name: ");
		emerName = keyboard.nextLine();

		System.out.print("Emergency contact phone: ");
		emerPhone = keyboard.nextLine();

		// Create the Patient object using the constructor that sets everything
		Patient patient = new Patient(first, middle, last, address, city,
				state, zip, phone, emerName, emerPhone);

		// ---------- Procedure 1 (no-arg constructor) ----------
		System.out.println();
		System.out.println("Enter the information for Procedure 1");
		System.out.println("-------------------------------------");

		System.out.print("Procedure name: ");
		procName = keyboard.nextLine();

		System.out.print("Procedure date (example 06/12/2023): ");
		procDate = keyboard.nextLine();

		System.out.print("Practitioner name: ");
		practitioner = keyboard.nextLine();

		procCharge = readCharge(keyboard);

		// Make the object with the no-arg constructor,
		// then use the setters to set ALL of the fields
		Procedure procedure1 = new Procedure();
		procedure1.setProcedureName(procName);
		procedure1.setProcedureDate(procDate);
		procedure1.setPractitionerName(practitioner);
		procedure1.setCharges(procCharge);

		// ---------- Procedure 2 (name and date constructor) ----------
		System.out.println();
		System.out.println("Enter the information for Procedure 2");
		System.out.println("-------------------------------------");

		System.out.print("Procedure name: ");
		procName = keyboard.nextLine();

		System.out.print("Procedure date (example 06/12/2023): ");
		procDate = keyboard.nextLine();

		System.out.print("Practitioner name: ");
		practitioner = keyboard.nextLine();

		procCharge = readCharge(keyboard);

		// Make the object with the name and date constructor,
		// then use the setters for the fields that are left
		Procedure procedure2 = new Procedure(procName, procDate);
		procedure2.setPractitionerName(practitioner);
		procedure2.setCharges(procCharge);

		// ---------- Procedure 3 (constructor that sets everything) ----------
		System.out.println();
		System.out.println("Enter the information for Procedure 3");
		System.out.println("-------------------------------------");

		System.out.print("Procedure name: ");
		procName = keyboard.nextLine();

		System.out.print("Procedure date (example 06/12/2023): ");
		procDate = keyboard.nextLine();

		System.out.print("Practitioner name: ");
		practitioner = keyboard.nextLine();

		procCharge = readCharge(keyboard);

		// Make the object with the constructor that sets all fields
		Procedure procedure3 = new Procedure(procName, procDate, practitioner, procCharge);

		// ---------- Display everything ----------
		System.out.println();
		System.out.println("Patient Information");
		displayPatient(patient);

		System.out.println();
		System.out.println("Procedure 1");
		displayProcedure(procedure1);

		System.out.println();
		System.out.println("Procedure 2");
		displayProcedure(procedure2);

		System.out.println();
		System.out.println("Procedure 3");
		displayProcedure(procedure3);

		// Calculate and display the total charges
		double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
		System.out.println();
		// %,.2f puts in commas and shows 2 decimal places
		System.out.printf("Total Charges: $%,.2f\n", totalCharges);

		// Display the programmer's name and date
		System.out.println();
		System.out.println("The program was developed by a Student: " + programmerName
				+ " " + programDate);

		keyboard.close();
	}

	/**
	 * Displays the information of the patient that is passed in.
	 *
	 */
	public static void displayPatient(Patient patient) {
		System.out.println(patient.toString());
	}

	/**
	 * Displays the information of the procedure that is passed in.
	 *
	 */
	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure.toString());
	}

	/**
	 * Adds up the charges of three procedures.
	 *
	 */
	public static double calculateTotalCharges(Procedure proc1, Procedure proc2,
			Procedure proc3) {
		double total = proc1.getCharges() + proc2.getCharges() + proc3.getCharges();
		return total;
	}

	/**
	 * Asks the user for the charges of a procedure. It keeps asking
	 * until the user types a number that is 0 or more.
	 * (Input validation with a while loop.)
	 */
	public static double readCharge(Scanner keyboard) {
		double charge = 0.0;
		boolean valid = false;

		while (!valid) {
			System.out.print("Charges (example 250.00): ");

			if (keyboard.hasNextDouble()) {
				charge = keyboard.nextDouble();
				keyboard.nextLine(); // clear the leftover newline

				if (charge >= 0) {
					valid = true;
				} else {
					System.out.println("Error: charges cannot be negative. Please try again.");
				}
			} else {
				keyboard.nextLine(); // throw away the bad input
				System.out.println("Error: please enter a number only. Please try again.");
			}
		}

		return charge;
	}
}
