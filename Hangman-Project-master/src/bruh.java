import java.util.*;
public class bruh {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String b = "bruh";
		String[] al = b.split("");
		ArrayList<String> a = new ArrayList<String>();
		;

		// add every letter  from al to an array named a
		for (int i = 0; i < al.length; i++) {
			a.add(al[i]);
		}

		//replace every index of the list ith dashes
		for (int i = 0; i < al.length; i++) {
			al[i] = "_";
		}
		System.out.println(al[0]);

		// Prints every item in the array list "a"
		for (int i = 0; i < al.length; i++) {
			System.out.println(a.get(i));
		}

		// Puts all of al into a string seperated by spaces
		String aString = "";
		for (int i = 0; i > a.size(); i++) {
			aString = al[i] + " ";
		}
		System.out.println(aString);


		String guess = "b";
		// replacing dashes with letters
		System.out.println("Repeat code brub");
		System.out.println(aString);
		while (true)
			for (int i = 0; i < a.size(); i++) {
				{
					if (a.contains(guess)) {
						break;
					}
				}


			}


	}
}
