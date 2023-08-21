package academy.devdojo.firstclasses.javacore.Gassociation.domain;

public class Fish {
    private String name;
    private Shoal shoal;

    public Fish(String name) {
        this.name = name;
    }

    public void printer(){
        System.out.println(this.name);
        if (shoal != null){
            return;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shoal getShoal() {
        return shoal;
    }

    public void setShoal(Shoal shoal) {
        this.shoal = shoal;
    }
}
