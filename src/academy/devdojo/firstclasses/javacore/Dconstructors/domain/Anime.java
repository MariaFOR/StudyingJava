package academy.devdojo.firstclasses.javacore.Dconstructors.domain;

public class Anime {

    private String name;
    private String type;
    private int episodes;
    private String genre;
    private String studio;

    public Anime(String name, String type, int episodes, String genre) {
        this();
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.genre = genre;
    }

    public Anime(String name, String type, int episodes, String genre, String studio) {
        this(name, type, episodes, genre);
        this.studio = studio;
    }


    public Anime(){
        System.out.println("Inside the no-argument constructor");
    }

    public void printer() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.genre);
        System.out.println(this.studio);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return this.episodes;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getStudio() {
        return studio;
    }

}
