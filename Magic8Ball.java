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
   // instatiate fields
   private ArrayList<String> responses;
   private Random random;
   
   // Constructor
   public Magic8Ball(String fileName) throws IOException {
      // Create ArrayList to hold all the responses stored in the specified file
      responses = new ArrayList<String>();
      
      // Create random object to generate random numbers
      random = new Random();
      
      // Create a File object to read from
      File fileToRead = new File(fileName);
      // Create a Scanner that reads from the previously created file
      Scanner fileReader = new Scanner(fileToRead);
      
      // Go through every line of the file and add each line to the ArrayList
      while(fileReader.hasNext()) {
         responses.add(fileReader.nextLine());
      }
      
   }
   
   public String getResponse() {
      // return a random response from responses ArrayList
      return responses.get(random.nextInt(responses.size()));
   }
   
   public String getKarma(int playTimes) {
      switch (playTimes) { // Return a better fortune the more times played
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