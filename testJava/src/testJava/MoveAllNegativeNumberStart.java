
package testJava;

import java.util.Arrays;

public class MoveAllNegativeNumberStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {-12,4,-9,-11,4,7};
		
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("result........"+Arrays.toString(arr));
		
	}

}
