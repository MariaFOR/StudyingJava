package academy.devdojo.firstclasses.javacore.EinstanceInitializerBlock.test;

import academy.devdojo.firstclasses.javacore.EinstanceInitializerBlock.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }

    }
}
