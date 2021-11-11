package practice;

public class Abstraction {

	public static void main(String[] args) {
		Iphone obj=new Iphone();
		Samsung obj1=new Samsung();
		show(obj1);
	}
	public static void show(phone obj)
	{
		obj.showConfig();
	}
}
abstract class phone
{
	public abstract  void  showConfig();	
}
class Iphone extends phone
	{
		public void showConfig()
		{
			System.out.println("4 gb Ram,lolipop");
		}
	}
class Samsung extends phone
{
		public void showConfig()
		{
			System.out.println("2 gb ram ,ios9.4");
		}
	}

