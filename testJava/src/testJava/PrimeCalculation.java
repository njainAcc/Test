package testJava;

public class PrimeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  num = 37;
		
		for(int i=3;i<=num;i++)
		{
			int temp =0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
					break;
				}
			}
	
			if(temp==0)
			{
				System.out.println(i);
			}
			
		}

	}

}
