public class Fan {
    private static final int SlOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String colour;

    public Fan(){
        speed = SlOW;
        on = false;
        radius = 5;
        colour = "blue";
    }
    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setOn(boolean on){
        this.on = on;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public String toString(){
        if (on){
            String speedName;

            if (speed == SlOW) {
                speedName = "SLOW";
            } else if (speed ==MEDIUM) {
                speedName = "MEDIUM";
            } else if (speed == FAST) {
                speedName = "FAST";
            }else {
                speedName = "UNKNOWN";
            }
            return "Fan speed: " + speedName
                    + ", colour: " + colour
                    + ", radius: " + radius;
        }
        else{
            return "Fan colour: " + colour
                    + ", radius: " + radius
                    + "\nfan is off";
        }
    }
}

