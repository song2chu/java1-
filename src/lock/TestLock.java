package lock;

public class TestLock {
    public static void main(String[] args) {
        Lock lock = new Lock();
        lock.setUnlock(7, 9, 3);
        lock.unLock(9, 3, 7);
        System.out.println(lock);
        System.out.println("---------");
        lock.unLock(7, 9, 3);
        System.out.println(lock);
    }
}
