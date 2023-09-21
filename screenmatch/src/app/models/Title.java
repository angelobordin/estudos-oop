package app.models;

public class Title {
    private String name;
    private int launchYear;
    private boolean planeIncluded;
    private double sumRate;
    private int totalRating;
    private int time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public boolean isPlaneIncluded() {
        return planeIncluded;
    }

    public void setPlaneIncluded(boolean planeIncluded) {
        this.planeIncluded = planeIncluded;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void getTitleData() {
        System.out.println("Nome do titulo: " + name);
        System.out.println("Ano de lançamento: " + launchYear);
    }

    public void rating(double rate) {
        sumRate += rate;
        totalRating++;
    }

    public double getMedia() {
        return sumRate / totalRating;
    }

    public int getTotalRating() {
        return totalRating;
    }

}
