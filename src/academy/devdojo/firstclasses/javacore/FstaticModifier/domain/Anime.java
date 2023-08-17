package academy.devdojo.firstclasses.javacore.FstaticModifier.domain;

public class Anime {

    private String name;
    private static int[] episodes;

    // 0 - Initialization block is executed when JVM loads class
    // 1 - Allocated memory space for object
    // 2 - each class attribute is created and initialized with default values or whatever is passed
    // 3 - initialization block is executed
    // 4 - constructor is executed

    static {
        System.out.println("Inside static initializer block");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Inside static initializer block 2");
    }

    static {
        System.out.println("Inside static initializer block 3");
    }

    {
        System.out.println("Inside the non-static initializer block");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : Anime.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

}
