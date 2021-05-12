package Challenge.C13;

public class Television {
    private int channel;
    private Show show;

    public Television(int channel, Show show){
        this.channel = channel;
        this.show = show;
    }

    public int getChannel() {
        return channel;
    }

    public Show getShow() {
        return show;
    }

    public void play(){
        System.out.println("Now playing: "+ show.getShowName() + " episode " + show.getEpisode());
    }
}
