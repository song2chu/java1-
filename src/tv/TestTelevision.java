package tv;

public class TestTelevision {
    public static void main(String[] args) {
        Television tv = new Television(4, 3, false);
        System.out.println(tv);
        tv.setChannel(3);
        tv.moveChannelDown();
        tv.moveChannelDown();
        tv.moveChannelDown();
              System.out.println("----------------");
        tv.setOn(true);
        System.out.println(tv);
    }
}
