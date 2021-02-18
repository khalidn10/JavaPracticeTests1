package java_tests;

public class Practice255
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int i = 1;
		int k = 4;
		
		while(i <= 10)
		{
			for (int j=0; j<k; j++)
			{
				System.out.print(i + " ");
				i++;
			}
			
			System.out.println("");
			k--;
		}
	}
}
