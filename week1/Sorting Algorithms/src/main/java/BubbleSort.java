/*
 * This is a simple BubbleSort Program.
 * */
import java.util.Scanner;

public class BubbleSort
{

	public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array"); 
	int size=sc.nextInt();
	System.out.println("Enter array elements");
  int array[]=new int[size];
  boolean flag;
	for(int i=0;i<size;i++) 
	{
		array[i]=sc.nextInt();
	}
	for(int i=0;i<size-1;i++)
	{
		flag=false;
	
		for(int j=0;j<size-1-i;j++)
		{
			if(array[j]>array[j+1])
			{
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
                 flag=true;		
			}
		}
		if(flag==false)break;
	}
	System.out.println("Sorted array is");
	for(int i=0;i<size;i++)
	{
		System.out.println(array[i]);
	}
	sc.close();	
	

}

}
