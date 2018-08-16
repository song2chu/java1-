package lock;

public class Lock {
    private int secret1;
    private int secret2;
    private int secret3;
    private boolean open;

    public Lock() {
        this(0, 0, 0, false);
    }

    public Lock(int secret1, int secret2, int secret3, boolean open) {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        this.open = open;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public int getSecret1() {
        return secret1;
    }

    public void setSecret1(int secret1) {
        this.secret1 = secret1;
    }

    public int getSecret2() {
        return secret2;
    }

    public void setSecret2(int secret2) {
        this.secret2 = secret2;
    }

    public int getSecret3() {
        return secret3;
    }

    public void setSecret3(int secret3) {
        this.secret3 = secret3;
    }
    
    public void setUnlock(int secret1, int secret2, int secret3) {
        if (secret1 >= 1 && secret1 <= 99 && secret2 >= 1 && secret2 <= 99 && secret3 >= 1 && secret3 <= 99) {
            this.secret1 = secret1;
            this.secret2 = secret2;
            this.secret3 = secret3;
        } else
            System.out.println("Password must be 1-99!");
    }
    
    public void unLock(int secret1, int secret2, int secret3) {
        if (secret1 == this.secret1 && secret2 == this.secret2 && secret3 == this.secret3) {
            this.open = true;
            System.out.println("Unlocked!");
        } else
            System.out.println("Invalid password!");
    }
    
    @Override
    public String toString() {
        String status = null;
        if (this.open)
            status = "Open";
        else
            status = "Closed";
        return "Password 1: " + this.secret1 + "\nPassword 2: " + this.secret2 + "\nPassword 3: " + this.secret3 + "\nStatus: " + status;
    }
}
