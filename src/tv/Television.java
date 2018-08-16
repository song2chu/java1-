package tv;

public class Television {
    private int channel;
    private int maxChannel;
    private int volume;
    private boolean on;

    public Television(int maxChannel) {
        this(0, maxChannel, 1, true);
    }

    public Television(int maxChannel, int volume, boolean on) {
        this(1, maxChannel, volume, on);
    }

    public Television(int channel, int maxChannel, int volume, boolean on) {
        this.channel = channel;
        this.maxChannel = maxChannel;
        this.volume = volume;
        this.on = on;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void moveChannelUp() {
        if (this.channel == this.maxChannel)
            System.out.println("Channel can't move up anymore!");
        else
            this.channel++;
    }
    
    public void moveChannelDown() {
        if (this.channel == 0)
            System.out.println("Channel can't move down anymore!");
        else
            this.channel--;
    }

    @Override
    public String toString() {
        String volume = null;
        if (this.volume == 3)
            volume = "HIGH";
        else if (this.volume == 2)
            volume = "MEDIUM";
        else if (this.volume == 1)
            volume = "LOW";
        
        if (this.on)
            return "Channel: " + this.channel + "\nVolume: " + volume + "\nOn: " + this.on;
        else
            return "Television is off!";
    }
}
