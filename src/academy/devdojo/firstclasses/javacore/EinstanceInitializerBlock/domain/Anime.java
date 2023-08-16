package academy.devdojo.firstclasses.javacore.EinstanceInitializerBlock.domain;

public class Anime {

    private String name;
    private int[] episodes;

    // 1 - Allocated memory space for object
    // 2 - each class attribute is created and initialized with default values or whatever is passed
    // 3 - initialization block is executed
    // 4 - constructor is executed

    {
        System.out.println("Inside the initializer block");
        episodes = new int[100];
        for(int i = 0; i < episodes.length; i++){
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime(){
        for(int episode: this.episodes){
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
