package Java_programs;

public class Calculate {
	
	public void display(int ar1[])
	{
		for(int i=0;i<5;i++){
		System.out.println(ar1[i]);
		}
	}
	
	public int[] add (int ar2[])
	{
		for(int i=0;i<5;i++)
		{
			ar2[i]+=5;
		}
		return ar2;
	}

	public static void main(String[] args) {
		
        int ar[]={10,2,3,8,20};
        Calculate c=new Calculate();
        c.display(ar);
        int []ar3=c.add(ar);
        c.display(ar3);
	}

}
