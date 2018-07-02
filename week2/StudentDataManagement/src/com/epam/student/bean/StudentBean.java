/**
 * The class StudentBean is a prototype for all the students.
 * @author Manasa Maddali
 */
 
package com.epam.student.bean;

public class StudentBean {
	
	/**
	*The string variable firstname is the first name of student.
	* The string variable lastname is the last name of student.
    * The integer variable identification_number is the id number of student.
    * The string variable year is the year of student.
	* The string variable department is the department name of student.
	*/
private String firstname;
private String lastname;
private int identification_number;
private String year;
private String department;

/**
 * * This method returns the firstname of the student.
 * @return **firstname  of the student**
 */
public String getFirstname() {
	return firstname;
}

/**
 *  This method sets the firstname of the student.
 */
public void setFirstname(String firstname) {
	this.firstname = firstname;
}

/**
 * * This method returns the lastname of the student.
 * @return **lastname  of the student**.
 */
public String getLastname() {
	return lastname;
}

/**
 *  This method sets the lastname of the student.
 */
public void setLastname(String lastname) {
	this.lastname = lastname;
}

/**
 *  This method returns the identifiaction_number of the student.
 * @return **identification_number of the student**.
 */

public int getIdentification_number() {
	return identification_number;
}

/**
 *  This method sets the identifiaction_number of the student.
 */
public void setIdentification_number(int identification_number) {
	this.identification_number = identification_number;
}

/**
 *  This method returns the year of the student.
 * @return **year of the student**.
 */
public String getYear() {
	return year;
}

/**
 *  This method sets the year of the student.
 */
public void setYear(String year) {
	this.year = year;
}

/** 
 * This method returns the department of the student.
 * @return **department of the student**.
 */
public String getDepartment() {
	return department;
}

/**
 *  This method sets the department of the student.
 */
public void setDepartment(String department) {
	this.department = department;
}

/**
 * This method overrides object class toString() method.
 */
public String toString() {
	return "\nFirst Name: "+firstname+"\nLast Name: "+lastname +"\nIdentification Number: "+identification_number+"\nYear: "+year+"\nDepartment: "+department;
}

}
