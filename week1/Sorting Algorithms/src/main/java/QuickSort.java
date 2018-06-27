/*
 * This is a simple QuickSort Program.
 */
import java.util.Scanner;

public class QuickSort {
	
	 void sort(int array[],int low,int high) 
	    {
	        int i=low;
	        int j=high;
	        int temp;
	        int pivot=array[(i+j)/2];//consider middle element as pivot.
	        /*
        	 * Increment the index till left element is greater than pivot, 
        	 * and right element is less than pivot.
        	 * If Search is done then swap.
            */
	        while(i<=j) 
	        {
	        	
	            while(array[i]<pivot) 
	            {
	                i++;
	            }
	            while(array[j]>pivot)
	            {
	                	j--;
	            }
	            if(i<=j) 
	            {
	                temp=array[i];
	                array[i]=array[j];
	                array[j]=temp;
	       //Move index to their next positions.
	                i++; 
	                j--;
	            }
	        }
	        //call sort method recursively. 
	        if(j>low)
	        {
	            sort(array,low,j);
	        }
            if(i<high)
	        
	        {
            	sort(array,i,high);
	       	}
	            	}
	    
	        public static void main(String[] args) 
	        {
	            Scanner sc = new Scanner( System.in );        
	            int  i;
	            System.out.println("Enter size of array");
	            int size = sc.nextInt();
	            int array[] = new int[size];
	            System.out.println("Enter array elements");
	            for (i = 0; i < size; i++)
	            {
	                array[i] = sc.nextInt();
	            }
	            QuickSort qs=new QuickSort();
	                   qs.sort(array,0,size-1); // Call sort method by passing array,beginindex,lastindex as arguments.
	                for (i = 0; i < size; i++)
	                {
	                System.out.println(array[i]);
	                }
	         sc.close();  
	         
	    }

}