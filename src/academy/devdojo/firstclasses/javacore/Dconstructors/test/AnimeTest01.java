package academy.devdojo.firstclasses.javacore.Dconstructors.test;

import academy.devdojo.firstclasses.javacore.Dconstructors.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV", 12, "action");
        Anime anime2 = new Anime();

        anime.printer();
        anime2.printer();
    }
}
