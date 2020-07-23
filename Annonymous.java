package Java_programs;

public class Annonymous {

	public static void main(String[] args) {
		System.out.println(sum(new int[] {10,2,3,5,20}));

	}
	
	public static int sum(int ar[])
	{
		int s=0;
		for(int i=0;i<ar.length;i++)
		{
			s=s+ar[i];
		}
		return s;
	}

}
