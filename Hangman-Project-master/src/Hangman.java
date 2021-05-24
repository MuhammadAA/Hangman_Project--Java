import java.util.*;

public class Hangman {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] Animal = new String[26];
		String[] Location = new String[10];
		String userWord = "";
		// Creating Lists

		Animal[0] = "Ant"; Animal[1] = "Bear" ; Animal[2] = "Cat" ; Animal[3] = "Deer"; Animal[4] = "Eel"; Animal[5]= "Ferret"; Animal[6]= "Girrafe"; Animal[7]= "Heron"; Animal[8]= "Ibis"; Animal[9]= "Jackal"; Animal[10]= "Kangaroo"; Animal[11]= "Lion"; Animal[12]= "Manatee"; Animal[13]= "Newt"; Animal[14]= "Otter"; Animal[15]= "Parrot"; Animal[16]= "Quail"; Animal[17]= "Rabbit"; Animal[18]= "Seal"; Animal[19]= "Tiger"; Animal[20]= "Unau"; Animal[21]= "Vulture"; Animal[22]= "Wasp"; Animal[23]= "Xeme"; Animal[24]= "Yak"; Animal[25]= "Zebra";
		Location[0] = "Australia"; Location[1] = "Bangladesh"; Location[2] = "Canada"; Location[3] = "Denmark"; Location[4] ="Egypt"; Location[5] = "France"; Location[6] = "Germany"; Location[7] = "Hungary"; Location[8] = "India"; Location[9]= "Japan";







// --------------------------------------------------------------------------------------------------------
		//game loop start

		System.out.println("Do you want to play a game of Hangman? (Enter YES to play, and NO to Quit program) ");
		String game = input.nextLine().toUpperCase();

		int Index = 0;
		String guess = "";
		String WrongVar = "";
		String pickList = "";
		String Word = "";
		// game loop
		if(game.equals("YES"))
		{
			System.out.print("");
			System.out.println("Would you like to guess an Animal, Location, or your own word");
			System.out.println("Type in 'Animal' or 'Location' or 'User' ");
			pickList = input.nextLine().toUpperCase();
			if (pickList.equals("Animal"))
			{
				Word = Animal[(int) (Math.random()* (25-0+1))+0];
			}
			else if (pickList.equals("Location"))
			{
				Word = Location[(int) (Math.random()* (9-0+1))+0];
			}
			else if (pickList.equals("User"))
			{
				System.out.println("Enter a word that you would like your peers to guess.");
				Word = input.nextLine();
			}

			String[] Dashes = Word.split("");
			ArrayList<String> WordList = new ArrayList<String>();
			int length = Dashes.length;
			ArrayList<String> Wrong = new ArrayList<String>();

//-----------------------------------------------------------------------------------------------------
			// fill wordList with the letters of the word
			for(int i = 0; i < length; i++)
			{
				WordList.add(Dashes[i]);
			}

// -----------------------------------------------------------------------------------------------------
			// turn every index in dashes into actual dashes
			for(int i = 0; i<length; i++)
			{
				Dashes[i] = " _ " ;
			}

//------------------------------------------------------------------------------------------------------
			// create a variable to store all the dashes

			String var = "";
			for(int i = 0; i<length; i++)
			{
				var += Dashes[i] + "";
			}
// -------------------------------------------------------------------------------------------------------
			// Print both lists and variable "var"

			String letters = "";
			for(int i = 0; i < length; i++)
			{
				letters += WordList.get(i);
			}
			System.out.println(letters); //- for beta testing
			System.out.println("Only enter letter by letter & Only the first letter is Capital.");
			while (true)
			{
				if(var.contains("_") == false)
				{
					System.out.println("");
					System.out.println("The word was: "+var);
					System.out.println("Congratulations, you guessed the word.");
					System.out.println("Thank you for playing Muhaa's Hangman Simulator.");
					break;
				}
				System.out.println(var);
				System.out.println("");
				System.out.println("Incorrect Letters "+"[ " +WrongVar+ " ]");
				System.out.println("Enter your guess: ");
				System.out.println("You have: " + var + " Letters left to guess the word");
				System.out.println("");
				guess = input.nextLine();


				if(WordList.contains(guess))
				{
					Index = WordList.indexOf(guess);
					Dashes[Index] = WordList.get(Index);
					WordList.set(Index,"_");
				}
				else
				{
					if (Wrong.contains(guess) == false & var.contains(guess) == false)
					{
						Wrong.add(guess);
					}
					else if (Wrong.contains(guess) == true)
					{
						System.out.println("You already used that letter, and it was incorrect.");
					}
					else if (var.contains(guess) == true)
					{
						System.out.println("You already used that letter, and it was correct.");
					}

				}

				var = "";
				WrongVar = "";
				for(int i = 0; i<length; i++)
				{
					var += Dashes[i] + "";
				}
				for(int i = 0; i<Wrong.size(); i++)
				{
					WrongVar += Wrong.get(i) + " ";
				}

			}
		}
		else if(game.equals("NO"))
		{
			System.out.println("Thank you for choosing Muhaa's Hangman simulator, Good Bye! ");
		}
	}
}
