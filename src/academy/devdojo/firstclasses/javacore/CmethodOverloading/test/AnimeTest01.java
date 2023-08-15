package academy.devdojo.firstclasses.javacore.CmethodOverloading.test;

import academy.devdojo.firstclasses.javacore.CmethodOverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive", "TV", 12, "action");

        anime.printer();
    }
}
