package app.models;

public class Serie extends Title {
    private int season;
    private int episodeBySeason;
    private boolean active;
    private int episodeTime;

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodeBySeason() {
        return episodeBySeason;
    }

    public void setEpisodeBySeason(int episodeBySeason) {
        this.episodeBySeason = episodeBySeason;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodeTime() {
        return episodeTime;
    }

    public void setEpisodeTime(int episodeTime) {
        this.episodeTime = episodeTime;
    }

    @Override
    public int getTitleTime() {
        return season * episodeBySeason * episodeTime;
    }
}
