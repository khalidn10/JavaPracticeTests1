package java_tests;

public class Practice257_2
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int i = 3;
		int k = 1;
		
		while(i <= 18)
		{
			for (int j=0; j<k; j++)
			{
				System.out.print(i + " ");
				i = i + 3;
			}
			
			System.out.println("");
			k++;
		}
	}
}
