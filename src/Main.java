import java.util.Random;
public class Main {
    public static void main(String[] args) {

        int bank = 100; //variables for the program
        int bet = 10;
        int point = 0;
        Random dice1 = new Random();
        Random dice2 = new Random();
        int total;
        String trash;

            int d1Value, d2Value; //setting the variables for the formula for program
            do {
                d1Value = dice1.nextInt(6) + 1;
                d2Value = dice2.nextInt(6) + 1;
                total = d1Value + d2Value; //formula to figure results
                //total = 7; //varible for testing
                System.out.printf("%d and %d equals %d\n", d1Value, d2Value, total); //formulas
                switch (total){
                    case 2:
                    case 3:
                    case 12:
                        System.out.println(total + " you lose");
                        bank -= bet;
                        break;
                    case 7:
                    case 11:
                        System.out.println(total + " you win");
                        bank += bet;
                        break;
                    default:
                        point = total;
                        System.out.println("Point " + point);
                        break;
                }
            }while (point ==0);

            do {
                d1Value = dice1.nextInt(6) + 1; //Variable repeating for second roll
                d2Value = dice2.nextInt(6) + 1;
                total = d1Value + d2Value;
                if (total == 7){
                    System.out.println("7 - you lose :(");
                    bank -=bet;
                    return; //quit roll
                } else if (total == point) {
                    System.out.println("Point - you win!");
                    bank +=bet;
                }
            }while(point != total)



    }
}