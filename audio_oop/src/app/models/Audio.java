package app.models;

public class Audio {
    private String title;
    private int duration;
    private int plays;
    private int likes;
    private int rate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public int getTotalPlay() {
        return plays;
    }

    public int getLikes() {
        return likes;
    }

    public int getRate() {
        return rate;
    }

    public void play() {
        this.plays++;
    }

    public void like() {
        this.likes++;
    }
}
