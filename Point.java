public class Point {

    //create fields 
    int x;
    int y; 

    //constructor
    public Point(int initX, int initY){
        x = initX;
        y = initY; 
    }

    public Point() {
        x = 0;
        y = 0; 
    }

    //methods
    public void printPoint() {
        System.out.println("(" + x + " ," + y + " )");
    }

    
    //setLocation changes the location of the 
    //point to the x,y values passed
    public void setLocation(int thatX, int thatY) {
        x = thatX; 
        y = thatY; 
    }
    //translate changes a Point's location 
    // by a given amount dx, dy. 
    public void translate(int dx, int dy){

    }

    //distance computes the distance between a 
    //Point and another Point parameter.  

    public double distance(Point other) {

        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2)); 
    }

    //distanceFromOrigin returns the distance
    //between the Point and the Origin (0,0)
    public double distanceFromOrigin(){

        return 0.0; 
    }

    //returns the quadrant (1,2,3,4) of the x/y plane this Point falls in. 
    public int quadrant() {

        return 1; 
    }

    //negates and swaps the x/y coordinates of the Point object. 
    // (5, -3) would become (3, -5)
    public void flip() {

    }




}