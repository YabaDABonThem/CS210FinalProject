// Allen Bao
// 11/30/21
// Final Project
// Creates Magic 8 ball to answer the user's questions
// Inputs that break code: none

import java.util.Scanner;
import java.io.IOException;

public class FinalProject {
   public static void main(String[] args) throws IOException {
      // Create new Magic8Ball and pass it the file name of the responses file.
      Magic8Ball myBall = new Magic8Ball("responses.txt");
      
      // Create Scanner to get user input
      Scanner keyboard = new Scanner(System.in);
      
      // Create loop variable to count the amount of questions asked
      int playTimes = 0;
      
      // infinite loop
      while(true) {
         // increase our playcount
         ++playTimes;
         // ask the user for a question
         System.out.println("Enter a yes or no question, or say \"quit\" to quit: ");
         if (keyboard.nextLine().equals("quit")) { // exit loop when user says to quit
            break;
         }
         // Print the Magic 8 Ball's response and the user's karma score
         System.out.println(myBall.getResponse());
         System.out.println("Your fortune outlook is: " + myBall.getKarma(playTimes) + ". Ask more questions for a better fortune. ");
      }
   }
}