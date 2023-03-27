package JAVA.week10;

public class work21 {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    public int speed = SLOW;
    public boolean on = false;
    public double radius = 5;
    public String color = new String("blue");
void fanOn() {
   on = true;
   return on;
}
//fan off
void fanOff() {
   on = false;
   return on;
}
//sets fan speed
void setSpeed(String speed) {
   this.speed=speed;
}
//sets custom radius
double setRadius(double rad) {
   rad = radius;
   return rad;
}
//sets custom color
void setColor(String colorType) {
   color = colorType;
}
//toString() method
public String toString() {
   return ("Speed: " + speed + "\nRadius: " + radius + "\nColor: " + "\nOn: " + on);
 }
}
}
