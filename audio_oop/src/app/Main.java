package app;

import app.models.Music;
import app.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music musica = new Music();
        musica.setAlbum("Album");
        musica.setSinger("Cantor");
        musica.setTitle("Minha Musica");

        for (int i = 0; i < 1000; i++) {
            musica.play();
        }

        for (int i = 0; i < 50; i++) {
            musica.like();
        }

        Podcast podcast = new Podcast();
        podcast.setTitle("Pod Pah");
        podcast.setHost("Igao");

        for (int i = 0; i < 24; i++) {
            podcast.play();
        }

        for (int i = 0; i < 10; i++) {
            podcast.like();
        }
    }
}
