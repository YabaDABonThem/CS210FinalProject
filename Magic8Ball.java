// Allen Bao
// 11/30/21
// Final Project First Draft
// The 8Ball class
// Inputs that break code:

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Magic8Ball {
   // Constructor
   public Magic8Ball(String fileName) {
      ArrayList<String> responses = new ArrayList<String>();
      Random random = new Random();
      Scanner fileReader = new Scanner(fileName);
      
      while(fileReader.hasNext()) {
         responses.add(fileReader.nextLine());
      }
   }
   
   public String getResponse() {
      return null;
   }
}