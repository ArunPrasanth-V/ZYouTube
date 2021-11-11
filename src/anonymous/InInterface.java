package anonymous;
//Lambdas magic
interface abc
{
	void some();
}
public class InInterface {
 
	 public static void main(String[] args)
	 {
		 abc obj=()-> System.out.println("Am The Best");	
		 obj.some();
	 }
}
