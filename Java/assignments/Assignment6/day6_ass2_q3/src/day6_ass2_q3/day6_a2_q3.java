package day6_ass2_q3;

public class day6_a2_q3 
{
	public static String check_elements(String[] a, String[] b)
	{
		
		
	}

	public static void main(String[] args) 
	{
		String [] a1 = {"humans", "Are", "Intelegent", "Creature"};
		String [] a2 = {"humans", "Are", "Intelegent", "Creature"};
		
		for(int i = 0; i< a1.length; i++)
		{
			for(int j = 0; j< a2.length; j++)
			{
				if(a1[i].equals(a2[j]))
					System.out.println(a1[i]);
			}
		}
	}

}
