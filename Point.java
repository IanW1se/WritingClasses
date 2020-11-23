public class Point {

    //create fields 
    private int x;
    private int y; 

    //constructor
    public Point(int initX, int initY){
        x = initX;
        y = initY; 
    }

    public Point() {
        x = 0;
        y = 0; 
    }

    //set (mutator methods)
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //get (accessor methods)

    public int getX() {
        return x;
    }

    public int getY() {
        return y; 
    }

    //methods
    public void printPoint() {
        System.out.println("(" + x + " ," + y + " )");
    }

    
    //setLocation changes the location of the 
    //point to the x,y values passed
    public void setLocation(int x, int y) {
        this.x = x; 
        this.y = y; 
    }
    //translate changes a Point's location 
    // by a given amount dx, dy. 
    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }

    //distance computes the distance between a 
    //Point and another Point parameter.  

    public double distance(Point other) {

        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2)); 
    }

    //distanceFromOrigin returns the distance
    //between the Point and the Origin (0,0)
    public double distanceFromOrigin(){

        return Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
    }

    //returns the quadrant (1,2,3,4) of the x/y plane this Point falls in. 
    public int quadrant() {

        if(x > 0) {
            if(y > 0){
                return 1;
            }
            else{
                return 4;
            }
        }
        else {
            if(y > 0){
                return 2;
            }
            else{
                return 3;
            }
        } 
    }

    //negates and swaps the x/y coordinates of the Point object. 
    // (5, -3) would become (3, -5)
    public void flip() {
        int temp = y;
        y = -x;
        x = -temp; 
    }




}