// Allen Bao
// 11/30/21
// Final Project First Draft
// A draft
// Inputs that break code: none

import java.util.Scanner;
import java.io.IOException;

public class FinalProject {
   public static void main(String[] args) throws IOException {
      Magic8Ball myBall = new Magic8Ball("responses.txt");
      
      Scanner keyboard = new Scanner(System.in);
      
      int playTimes = 0;
      
      while(true) {
         ++playTimes;
         System.out.println("Enter a yes or no question, or say \"quit\" to quit: ");
         if (keyboard.nextLine().equals("quit")) {
            break;
         }
         System.out.println(myBall.getResponse());
         System.out.println(myBall.getKarma(playTimes));
      }
   }
}