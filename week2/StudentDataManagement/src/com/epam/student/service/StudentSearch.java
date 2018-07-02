/**
 * StudentSearch class performs search operation based on user requirement.
 * @author Manasa Maddali
 */

package com.epam.student.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.epam.student.bean.StudentBean;
public class StudentSearch {

	/**
	 * This method displays the student information based on the search Parmeter.
	 * @param studentList
	 * @param searchValue
	 */
public void searchstudent(ArrayList<StudentBean> studentList,int searchValue) {
	int c=0;
	Scanner sc=new Scanner(System.in);
	
	if(searchValue==1) {
		System.out.println("Enter First Name");
		String parameter=sc.next();
	
		for(int i=0;i<studentList.size();i++) {
			
			if( studentList.get(i).getFirstname().equalsIgnoreCase(parameter)) {
				System.out.println(studentList.get(i));
				c++;
			}
			
			
		}
		
	}
		else if(searchValue==2) {
			System.out.println("Enter Last Name");
			String parameter=sc.next();
			for(int i=0;i<studentList.size();i++) {
				
				if( studentList.get(i).getLastname().equalsIgnoreCase(parameter)) {
					System.out.println(studentList.get(i));
			       c++;
				}
			
		}
	}
		else if(searchValue==3) {
			System.out.println("Enter Identification Number");
			int parameter=sc.nextInt();
						for(int i=0;i<studentList.size();i++) {
				if( studentList.get(i).getIdentification_number()==(parameter)) {
					System.out.println(studentList.get(i));
				    c++;
				}
				
		}
	}
		else if(searchValue==4) {
			System.out.println("Enter Year");
			String parameter=sc.next();
			for(int i=0;i<studentList.size();i++) {
				if( studentList.get(i).getYear().equalsIgnoreCase(parameter)) {
					System.out.println(studentList.get(i));
				    c++;
				}
				
		}
	}
		else if(searchValue==5) {
			System.out.println("Enter Department");
			String parameter=sc.next();
			for(int i=0;i<studentList.size();i++) {
				
				if( studentList.get(i).getDepartment().equalsIgnoreCase(parameter)) {
					System.out.println(studentList.get(i));
				     c++;
				}
				
		}
	}
	
	if(c==0) {
		System.out.println("Match Not Found");
	}
	sc.close();
}
}
