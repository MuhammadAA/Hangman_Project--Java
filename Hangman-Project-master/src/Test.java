import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] a = new String[4];
		
		a[0] = "D"; a[1] = "e"; a[2] = "e"; a[3] = "r";
		String[] b = new String[4];
		b[0] = "_"; b[1] = "_"; b[2] = "_"; b[3] = "_";
		
		
		int counter = 0;
		String word = "";
		int index = 0;
		
		
		while(true)
		{
			System.out.println("Guess the letters: ");
			word = input.nextLine();
			for(int i = 0; i< 4; i++)
			{
				if(word == a[i])
				{
					index = i;
					b[index] = a[index];
				}
				else
				{
					System.out.println("Your Guess was incorrect, Try Again.");
					break;
				}
			}
			
			
			System.out.println(a[0] + a[1] + a[2] + a[3]);
			System.out.println(b[0] + b[1] + b[2] + b[3]);
		}
		
	}

}
