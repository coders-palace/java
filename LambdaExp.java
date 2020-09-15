package Java_programs;
@FunctionalInterface
interface MyInterface
{
	//abstract method
	String reverse(String s);
}
public class LambdaExp {

	public static void main(String[] args) {
		MyInterface ref =(str) ->{
			
			String result ="";
			for(int i=str.length()-1;i>=0;i--)
			{
				result+=str.charAt(i);
				
			}
			return result;
		};
		
		System.out.println(" Reverse of Red Apple ="+ref.reverse("Red Apple"));

	}

}
