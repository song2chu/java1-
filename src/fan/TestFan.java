package fan;

public class TestFan {
    public static void main(String[] args) {
        Fan f1 = new Fan(Fan.SLOW, 16.0, true, "orange");
        f1.speedUp();
        f1.speedUp();
        f1.speedDown();
        System.out.println(f1);
        
        System.out.println("------------------");
        
        Fan f2 = new Fan(Fan.FAST, 6.0, false, "green");
        f2.speedUp();
        f2.speedDown();
        f2.setOn(true);
        System.out.println(f2);
    }
}
