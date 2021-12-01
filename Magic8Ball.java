// Allen Bao
// 11/30/21
// Final Project First Draft
// The 8Ball class
// Inputs that break code:

import java.util.Scanner;
import java.io.File;
import java.util.Random;
import java.util.ArrayList;

public class Magic8Ball {
   private ArrayList<String> responses;
   private Random random;
   
   // Constructor
   public Magic8Ball(String fileName) {
      responses = new ArrayList<String>();
      
      random = new Random();
      
      File fileToRead = new File(fileName);
      Scanner fileReader = new Scanner(fileToRead);
      
      while(fileReader.hasNext()) {
         responses.add(fileReader.nextLine());
      }
      
      // debug loop
      for (String s : responses) {
         System.out.println(s);
      }
      
   }
   
   public String getResponse() {
      // return a random response
      return responses.get(random.nextInt(responses.size()));
   }
   
   public String getKarma(int playTimes) {
      switch (playTimes) {
         case 1:
            return "Great Misfortune";
         case 2:
            return "Misfortune";
         case 3:
            return "Moderate Fortune";
         case 4:
   			Return "Rising Fortune"
   		case 5: 
   			return "Good Fortune";
   		default: 
   			return "Great Fortune";
      }
   }
}