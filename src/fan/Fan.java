package fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    private int speed;
    private double radius;
    private boolean on;
    private String color;

    public Fan() {
        this(Fan.SLOW, 5.0, false, "blue");
    }

    public Fan(int speed, double radius, boolean on) {
        this(speed, radius, on, "blue");
    }

    public Fan(int speed, double radius, boolean on, String color) {
        this.speed = speed;
        this.radius = radius;
        this.on = on;
        this.color = color;
    }


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void speedUp() {
        if (this.speed == Fan.FAST)
            System.out.println("The fan can't speed up anymore!");
        else
            this.speed++;
    }
    
    public void speedDown() {
        if (this.speed == Fan.SLOW)
            System.out.println("The fan can't speed down anymore!");
        else
            this.speed--;
    }

    @Override
    public String toString() {
        String speed = null;
        if (this.speed == Fan.FAST)
            speed = "FAST";
        else if (this.speed == Fan.MEDIUM)
            speed = "MEDIUM";
        else if (this.speed == Fan.SLOW)
            speed = "SLOW";
        
        String ret = "Fan speed: " + speed + "\nRadius: " + this.radius + "\nColor: " + this.color;
        
        if (this.on)
            return ret;
        else
            return ret + "\nFan is off!";
    }
}
