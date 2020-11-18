import java.util.Random;

public class Dice {

     private int faceValue; 
     private int numSides; 


     //constructor
     public Dice(int numSides){

         this.numSides = numSides; 
         faceValue = 1; 
     }

     public void roll(){

         Random rand = new Random();
         faceValue = rand.nextInt(numSides) + 1;

     }

    public int getFaceValue(){

        return faceValue; 

    }



}
