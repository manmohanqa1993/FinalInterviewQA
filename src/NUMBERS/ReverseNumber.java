package NUMBERS;

public class ReverseNumber {
	public static void main(String[] args) {
		
		int num=123;
		int rev=0;
		int last;
		
		while(num>0)
		{
			last=num%10;
			rev=rev*10+last;
			num=num/10;
		}
		System.out.println(rev);
	}

}
