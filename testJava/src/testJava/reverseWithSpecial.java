package testJava;

public class reverseWithSpecial {
	public static void main(String args[])
	{
		String s = "a#asgr&m";
		
		char c[] = s.toCharArray();
		int i=0;
		int j = c.length-1;
		
		while(i<j)
		{
			if(!Character.isAlphabetic(c[i])) i++;
			else if(!Character.isAlphabetic(c[j])) j--;
			
			else {
				char ch = c[i];
				c[i] = c[j];
				c[j]=ch;
				i++;
				j--;
			}
		}
		
		String s1 = new String(c);
		System.out.println(s1);
	}

}
