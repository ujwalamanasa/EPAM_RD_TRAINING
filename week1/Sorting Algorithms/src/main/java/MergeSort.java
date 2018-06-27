/*
 * This is a simple MergeSort Program.
 * */
import java.util.Scanner;
 
public class MergeSort 
{
   void sort(int[] array, int low, int high) 
    {
        int range= high - low;         
        if (range <= 1) 
            return; 
        int mid = low + range/2; 
       //call sort method recursively. 
        sort(array, low, mid); 
        sort(array, mid, high);
        
        int[] temp = new int[range];
        int i = low;
        int j = mid;
       //Merge two sorted arrays. 
        for (int k = 0; k < range; k++) 
        {
            if (i == mid)
            {
             temp[k] = array[j++];
            }
             else if (j == high)
             {
                temp[k] = array[i++];
             }
                else if (array[j]<array[i]) 
                { 
                temp[k] = array[j++];
                }
                else
                {
                temp[k] = array[i++];
                }
         }    
        for (int k = 0; k < range; k++)
        {
            array[low + k] = temp[k];         
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
        MergeSort ms=new MergeSort();
        ms.sort(array,0,size);// Call sort method by passing array,beginindex,size as arguments.
            for (i = 0; i < size; i++)
            {
            System.out.println(array[i]);
            }
     sc.close();             
    }    
}