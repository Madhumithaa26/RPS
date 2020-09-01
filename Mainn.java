
 import java.util.*;
              // Rock Paper Scissors

import java.util.*;

class Main 
{
    
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";

    public static void main(String args[]) 
    {
      System.out.println("Enter any one of the following inputs:  ");
      System.out.println("ROCK");
      System.out.println("PAPER");
      System.out.println("SCISSORS");
      System.out.println();
          
      String playerMove = getPlayerMove();
      String computerMove = getComputerMove(); 
 
      if (playerMove.equals(computerMove))
            System.out.println("Game is Tie !!");
      // if playerMove is ROCK         
      else if (playerMove.equals(Main.ROCK))
        System.out.println(computerMove.equals(Main.PAPER) ? "Computer Wins": "Player wins");   
      // if playerMove is PAPER
      else if (playerMove.equals(Main.PAPER))
        System.out.println(computerMove.equals(Main.SCISSORS) ? "Computer Wins": "Player wins");   
      // if playerMove is SCISSORS    
      else
        System.out.println(computerMove.equals(Main.ROCK) ? "Computer Wins": "Player wins");   
    }
    
    /* Get Computer's move using Random 
       class nextInt() method */   
    public static String getComputerMove()
    {
        String computermove;
        Random m = new Random();
        int input = m.nextInt(3)+1;
        if (input == 1)
            computermove = Main.ROCK;
        else if(input == 2)
            computermove = Main.PAPER;
        else
            computermove = Main.SCISSORS;
            
        System.out.println("Computer move : " + computermove);
        System.out.println();
        return computermove;    
    }
    
    /* Get Player's move using Scanner
       class */
    public static String getPlayerMove()
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String playermove = input.toUpperCase();
        System.out.println("Player move : "+ playermove);
        return playermove;
    }    
}