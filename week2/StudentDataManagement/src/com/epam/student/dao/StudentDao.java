/**
 * The class StudentDao reads the data from the csv file and stores the values in arraylist.
 * @author Manasa Maddali
 */

package com.epam.student.dao;

import java.io.*;
import java.util.*;

import com.epam.student.bean.StudentBean;

public class StudentDao{

	/**
	  * This method takes csv file as input and returns studentList.
	  * @return **studentList**
	  */

	public ArrayList<StudentBean> insertintolist() {
		
		ArrayList<StudentBean> studentList = new ArrayList<StudentBean>();
	try {
@SuppressWarnings("resource")
BufferedReader br=new BufferedReader(new FileReader("StudentInformation.csv"));
String line="";
StudentBean[] sb=new StudentBean[5];
int i=0;
while ((line = br.readLine()) != null) 
{
	
    String[] studentDetails = line.split(",");
   
     sb[i]=new StudentBean();
    sb[i].setFirstname(studentDetails[0]);
    sb[i].setLastname(studentDetails[1]);
    sb[i].setIdentification_number(Integer.parseInt(studentDetails[2]));
    sb[i].setYear(studentDetails[3]);
    sb[i].setDepartment(studentDetails[4]);
    studentList.add(sb[i]);
    
    i++;
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}

return  (ArrayList<StudentBean>) studentList;
	}

		}
