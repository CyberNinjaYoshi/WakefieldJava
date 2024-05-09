import java.util.Scanner;
public class Game_Scoring_Project{
   public static void main(String[] args){
      /*
      this code asks the basketball player how many layups, three pointers,
      and freethrows you've made.Then it will calculate how many points you made. 
      Then it will ask for the total score of your team and calculate the percentage 
      of how much you helped.
      */
      
      Scanner s = new Scanner(System.in);
      
      System.out.println("Hey! I'm here to track how many points you made in Basketball!");
      System.out.println("How many Layups did you make? ");
      int layups = s.nextInt();
      
      System.out.println("\nHow many Three Pointers did you make? ");
      int threes = s.nextInt();
      
      System.out.println("\nHow many Free Throws did you make? ");
      int freet = s.nextInt();
      
      int urTotal = 0;
      
      urTotal +=(layups*2);
      urTotal +=(threes*3); 
      urTotal += freet;
      
      System.out.println("What was the total score at the end? ");
      int total = s.nextInt();
      
      double urPercent = ((double)urTotal/total)*100;
      int remainder = total%urTotal;
      
      System.out.println("You made "+urTotal +" points, which was "+urPercent+"% of the total score and with a remainder of "+remainder);
      
      

      

      

      
   }
}