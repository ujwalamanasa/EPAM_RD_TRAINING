/**
 * StudentSort class performs sort operation based on user requirement.
 * @author Manasa Maddali
 */
package com.epam.student.service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.epam.student.bean.*;


public class StudentSort  {
	
	/**
	 * This method displays the student information based on the sort Parmeter.
	 * @param studentList
	 * @param sortValue
	 */
		public void sortstudent(ArrayList<StudentBean> studentList, int sortValue) {
							StudentBean[] sb=new StudentBean[studentList.size()];

							 sb=studentList.toArray(sb);
									if(sortValue==1) {
			
			
										Collections.sort(studentList, new Comparator<StudentBean>() {
										    public int compare(StudentBean o1, StudentBean o2) {
										    	return o1.getFirstname().compareTo(o2.getFirstname());
										    }
										});
										display(studentList);
	                               	}
									else if(sortValue==2) {
										Collections.sort(studentList, new Comparator<StudentBean>() {
										    public int compare(StudentBean o1, StudentBean o2) {
										    	return o1.getLastname().compareTo(o2.getLastname());
										    }
										});
										display(studentList);
									}
									else if(sortValue==3) {
										Collections.sort(studentList, new Comparator<StudentBean>() {
										    public int compare(StudentBean o1, StudentBean o2) {
										    	int id1=o1.getIdentification_number();
										    	int id2=o2.getIdentification_number();
										    	if(id1>id2) {
										    		return 1;
										    	}
										    	else if(id1<id2) {
										    		return -1;
										    	}
										    	else {
										    		return 0;
										    	}
										    	
										    }
										});
										display(studentList);
									}
									else if(sortValue==4) {
										Collections.sort(studentList, new Comparator<StudentBean>() {
										    public int compare(StudentBean o1, StudentBean o2) {
										    	return o1.getYear().compareTo(o2.getYear());
										    }
										});
										display(studentList);
									}
									else {
										Collections.sort(studentList, new Comparator<StudentBean>() {
										    public int compare(StudentBean o1, StudentBean o2) {
										    	return o1.getDepartment().compareTo(o2.getDepartment());
										    }
										});
										display(studentList);
									}
		
	
						}
						void display(ArrayList<StudentBean> studentList) {
							for(int i=0;i<studentList.size();i++) {
							System.out.println(studentList.get(i));
						}
						}

}
