package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class 1Game {
    private static boolean playAgain(Scanner scanner){
        System.out.println("Do You want to play (n) or end (x) ?");
        switch (scanner.next()){
            case "n":
                return areYouSure(scanner);
            case "x" :
                return !areYouSure(scanner);

            default:
                System.out.println("Invalid option!");
                break;
        }
        return false;
    }

    private static boolean areYouSure(Scanner scanner){
        System.out.println("Are You sure y/n ?");
        switch (scanner.next()){
            case "y" :
                return true;
            case   "n":
                return false;
            default:
                System.out.println("Invalid option!");
                break;
        }

        return false;
    }
    private static void checkScore(String name, int p1, int p2){
        System.out.println(name + " vs Computer: " + p1 + "-" + p2);
    }

    private static Move toMove(String input) {
        switch (input) {
            case "Paper": return new Paper();
            case "Scissors": return new Scissors();
            case "Rock": return new Rock();
            default: return null;

        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Moves computer = new Computer(new Random());
        Moves user = new User(scanner);

        int userScore = 0;
        int computerScore = 0;
        

        String first_name;
        int endScore;

        System.out.println("What is Your name?");
        first_name = scanner.next();

        System.out.println("How much wins to end?");
        endScore = scanner.nextInt();

        System.out.println("Rock Paper Scissors");
        while (playAgain(scanner)) {
            Move com = toMove(computer.play());
            Move gamer = toMove(user.play());

            RoundResult result = gamer.win(com);
          if (result.isTie()) {
              System.out.println("TIE!");
          } else if (result.isWin()) {
              System.out.println(first_name + " You Wins!");
              userScore++;
          } else {
              System.out.println(first_name + " You lost");
              computerScore++;
          }
          checkScore(first_name, userScore, computerScore);
            if(userScore == endScore || computerScore == endScore) {
                System.out.println("End Score!");
                break;

            /*System.out.println(com + " - "+gamer);
            if (gamer.equals(com)) {
                System.out.println("TIE !");
                checkScore(first_name, userScore, computerScore);
            } else if (("Rock".equals(gamer)&& "Scissors".equals(com)) ||
                      ("Scissors".equals(gamer) && "Paper".equals(com))||
                      ("Paper".equals(gamer) && "Rock".equals(com))) {
                System.out.println(first_name + " You Wins!");
                userScore++;
                checkScore(first_name, userScore, computerScore);
            } else {
                assert (("Rock".equals(com) && "Scissors".equals(gamer)) ||
                        ("Scissors".equals(com) && "Paper".equals(gamer)) ||
                        ("Paper".equals(com) && "Rock".equals(gamer)));
                System.out.println(first_name + " You lost");
                computerScore++;
                checkScore(first_name, userScore, computerScore);
            }
             if(userScore == endScore || computerScore == endScore) {
                 System.out.println("End Score!");
                 break;*/

            }
        }

    }

}
