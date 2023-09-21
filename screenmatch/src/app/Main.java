package app;
import app.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie meuFilme = new Movie();
        meuFilme.setName("TOP GUN");
        meuFilme.setLaunchYear(2023);

        meuFilme.getTitleData();
        meuFilme.rating(5.5);
        meuFilme.rating(8.6);
        meuFilme.rating(7);

    }
}
