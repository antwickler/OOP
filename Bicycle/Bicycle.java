public class Bicycle implements Vehicle {
    private int speed;
    private int gear;
    private int slow;
    
    public void changeGear(int a) {
        gear = a;
    }

    public void speedUp(int a) {
        speed = speed + a;   
    }

    public void applyBrakes(int a) {
        slow = speed - a;
    }

    public String toString() {
        return "Gear: " + gear + " " + "SpeedUP: " + speed + " " + "Brakes: " + slow;
    }
}