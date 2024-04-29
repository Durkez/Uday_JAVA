
package Arrays;
import java.util.*;
public class ArrayValuesFromUser {
	
	
	

		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the Array Size");
			int size=sc.nextInt();
			int arr[]= new int[size];
			for(int i=0;i<arr.length;i++)
			{
				
				 arr[i]=sc.nextInt(); 
					
				
			}
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
			

		}

	}


