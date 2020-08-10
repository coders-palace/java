package Java_programs;

public class Area {

	public void cal_area(double l,double b)
	{
		double ar=l*b;
		System.out.println("Area of Rectangle :"+ar);
	}
	
	public void cal_area(double r)
	{
		double ar;
		ar=3.14*r*r;
		System.out.println("Area of circle :"+ar);
	}
	public static void main(String[] args) {
		Area a=new Area();
		a.cal_area(10.5, 3.2);
		a.cal_area(5.1);

	}

}
