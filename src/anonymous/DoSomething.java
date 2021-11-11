package anonymous;
class demo{
	public void show()
	{
		System.out.println("Am The Best");
	}
	
}
//Creating ananymas Class 
public class DoSomething 
{
	public static void main(String[] args) 
	{
		demo obj=new demo()
			{
				public void show() 
				{
					System.out.println("Someone try to OverCome You");
				}
			};
	
   obj.show();	
	}
}
