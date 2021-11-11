package practice;

public class PrintOnlyNumberInAString {

	public String printNumber(String word)
	{
		word=word.replaceFirst("\\D+", "");
		return word;
	}
	
}
