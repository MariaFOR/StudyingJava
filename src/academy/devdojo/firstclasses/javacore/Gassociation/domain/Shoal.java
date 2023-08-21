package academy.devdojo.firstclasses.javacore.Gassociation.domain;

public class Shoal {
    private String name;
    private Fish[] pisces;

    public Shoal(String name) {
        this.name = name;
    }

    public Shoal(String name, Fish[] pisces) {
        this.name = name;
        this.pisces = pisces;
    }

    public void printer(){
        System.out.println(this.name);
        if (pisces == null) return;
        for (Fish fish: pisces){
            System.out.println(fish.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fish[] getPisces() {
        return pisces;
    }

    public void setPisces(Fish[] pisces) {
        this.pisces = pisces;
    }
}
