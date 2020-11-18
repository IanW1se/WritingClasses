import java.util.Random;

public class Dice {

     private int faceValue; 
     private int numSides; 


     //constructor
     public Dice(int numSides){

         this.numSides = numSides; 
         faceValue = 1; 
     }

     //mutator method.  Sets the state of the face value. 
     public void roll(){

         Random rand = new Random();
         faceValue = rand.nextInt(numSides) + 1;

     }

    //accessor method.  GETS the current state of the facevalue.  
    public int getFaceValue(){

        return faceValue; 

    }



}
