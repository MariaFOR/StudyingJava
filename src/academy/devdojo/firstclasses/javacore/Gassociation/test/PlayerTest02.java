package academy.devdojo.firstclasses.javacore.Gassociation.test;

import academy.devdojo.firstclasses.javacore.Gassociation.domain.Player;
import academy.devdojo.firstclasses.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Team team = new Team("Brazilian Team");

        player1.setTeam(team);

        player1.printer();
    }
}
