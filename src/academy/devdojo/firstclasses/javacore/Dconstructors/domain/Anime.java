package academy.devdojo.firstclasses.javacore.Dconstructors.domain;

public class Anime {

    private String name;
    private String type;
    private int episodes;
    private String gender;

    public Anime(String name, String type, int episodes, String gender) {
        System.out.println("Inside of constructor");
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
    }

    public Anime(){

    }

    public void printer() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.gender);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
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
}
