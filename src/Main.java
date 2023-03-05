import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        int point = 0; //variables for the program
        Random dice1 = new Random();
        Random dice2 = new Random();
        int total;
        String trash;
        String keepPlaying = "y or n"; // In my mush brain today I could not get this to work in the prompt.
                                       // I know I am not remembering something simple for this

            int d1Value, d2Value; //setting the variables for the formula for program
            do {
                d1Value = dice1.nextInt(6) + 1;
                d2Value = dice2.nextInt(6) + 1;
                total = d1Value + d2Value; //formula to figure results
                //total = 7; //varible for testing
                System.out.printf("%d and %d equals %d\n", d1Value, d2Value, total); //formula
                switch (total){
                    case 2:
                    case 3:
                    case 12:
                        System.out.println(total + " you lose");
                        break;
                    case 7:
                    case 11:
                        System.out.println(total + " you win");
                        break;
                    default:
                        point = total;
                        System.out.println("Point " + point);
                        break; //used to break the switch
                }
            }while (point ==0);

            do {
                d1Value = dice1.nextInt(6) + 1; //Variable repeating for second roll
                d2Value = dice2.nextInt(6) + 1;
                total = d1Value + d2Value;
                if (total == 7){
                    System.out.println("7 - you lose :(");
                    return; //quit
                } else if (total == point) {
                    System.out.println("Point - you win!");
                } else {
                    System.out.println("Keep Rolling");
                }
            }while(point != total);

        System.out.print("Do you want to play again? Say Y or N: ");
        Scanner keyboard = new Scanner(System.in);//scanner variable to setup for if they want to play again
                keepPlaying = keyboard.nextLine();
            if (keepPlaying.equalsIgnoreCase("y"));
                    else{
                    trash = keyboard.nextLine();
                    System.out.println("You have not enter Y or N - " + trash + " please enter Y or N."); //variable to have user put correct inputs
                }if (keepPlaying.equalsIgnoreCase("n"))
                    System.out.println("Thank you for playing :)");

        }



    }