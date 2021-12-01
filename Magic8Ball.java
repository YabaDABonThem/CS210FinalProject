// Allen Bao
// 11/30/21
// Final Project First Draft
// The 8Ball class
// Gives a random response to a yes/no question and also gives a karma score that increases with repeated playthroughs.
// Inputs that break code: Invalid filename

import java.util.Scanner;
import java.io.File;
import java.util.Random;
import java.util.ArrayList;
import java.io.IOException;

public class Magic8Ball {
   private ArrayList<String> responses;
   private Random random;
   
   // Constructor
   public Magic8Ball(String fileName) throws IOException {
      responses = new ArrayList<String>();
      
      random = new Random();
      
      File fileToRead = new File(fileName);
      Scanner fileReader = new Scanner(fileToRead);
      
      while(fileReader.hasNext()) {
         responses.add(fileReader.nextLine());
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
   			return "Rising Fortune";
   		case 5: 
   			return "Good Fortune";
   		default: 
   			return "Great Fortune";
      }
   }
}