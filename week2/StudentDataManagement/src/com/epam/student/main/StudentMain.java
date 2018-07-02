/**
 * This is a StudentMain class, where a menu is displayed.
 * Operations selected by the user are performed.
 * @author Manasa Maddali
 */
package com.epam.student.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.epam.student.bean.StudentBean;
import com.epam.student.dao.StudentDao;
import com.epam.student.service.StudentSearch;
import com.epam.student.service.StudentSort;

public class StudentMain {

	/**
	 * In the main method,searching and sorting operations on studentList is performed, based on user choice.
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
	StudentDao sd=new StudentDao();
	ArrayList<StudentBean> studentList=sd.insertintolist();
	
		
		System.out.println("Menu\n");
		System.out.println("1.Searching\n");
		System.out.println("2.Sorting\n");
		System.out.println("3.0 to exit\n");
		
		int option=sc.nextInt();
		switch(option) {
		case 0:
		    break;
		case 1:
			System.out.println("1.Search by FIRST NAME\n");
			System.out.println("2.Search by LAST NAME\n");
			System.out.println("3.Search by IDENTIFICATION NUMBER\n");
			System.out.println("4.Search by YEAR\n");
			System.out.println("5.Search by BRANCH\n");
		     int searchValue=sc.nextInt();
		     StudentSearch sse=new StudentSearch();
		     sse.searchstudent(studentList,searchValue);
		     break;
		case 2:
		 	System.out.println("1.Sort by FIRST NAME\n");
			System.out.println("2.Sort by LAST NAME\n");
			System.out.println("3.Sort by IDENTIFICATION NUMBER\n");
			System.out.println("4.Sort by YEAR\n");
			System.out.println("5.Sort by BRANCH\n");
			 int sortValue=sc.nextInt();
		  StudentSort sso=new StudentSort();
		  sso.sortstudent(studentList,sortValue);
			break;
		default:
			break;
		
			
		}
           sc.close();
		
	}


	

}
