public class ClassRunner{

  public static void main(String [] args){
  
    Dice d1 = new Dice(6);
    Dice d2 = new Dice(6);

    System.out.println("Pre Roll");
    System.out.println(d1.getFaceValue());
    System.out.println(d2.getFaceValue());

    d1.roll();
    d2.roll();

    System.out.println("Post Roll");
    System.out.println(d1.getFaceValue());
    System.out.println(d2.getFaceValue());
      
  
  }

}
