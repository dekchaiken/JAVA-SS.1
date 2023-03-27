package JAVA.week10;

public class work2 {

    final static int SLOW=1;
    final static int MEDIUM=2;
    final static int FAST=3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public work2(){
        speed= SLOW;
        on=false;
        radius=5;
        color="blue";
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed= speed;
    }

    public boolean getOn(){
        return on;
    }

    public void setOn(boolean on){
        this.on= on;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius= radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color= color;
    }

    public String toString(){
        String fanStatus;
        if(on){
            fanStatus= "Fan Speed: " + Integer.toString(speed)+ "\n" + "Color: " + color + "\n" + "Radius: " + Double.toString(radius);
        } else {
            fanStatus= "Fan is off" + "\nColor: " + color + "\n" + "Radius: " + Double.toString(radius);
        }

        return fanStatus;
    }

}