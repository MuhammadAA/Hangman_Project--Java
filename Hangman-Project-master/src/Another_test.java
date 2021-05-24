import java.util.*;
public class Another_test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Word = "Animal";
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
        //System.out.println(letters);




// --------------------------------------------------------------------------------------------------------
        //game loop start

        System.out.println("Do you want to play a game of Hangman? (Enter YES to play, and NO to Quit program) ");
        String game = input.nextLine().toUpperCase();

        int Index = 0;
        String guess = "";
        String WrongVar = "";
        // game loop
        if(game.equals("YES"))
        {
            //System.out.println("Only enter letter by letter & Only the first letter is Capital.");
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

