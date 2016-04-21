package eu.corstjens.java8.features.stream;

import eu.corstjens.java8.features.model.Player;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * Created by koencorstjens on 21/04/16.
 */
public class ComparatorExample {

    @Test
    public void test() {
        List<Player> players = new ArrayList<>();
        players.add(new Player("An", 24));
        players.add(new Player("Karel", 34));
        players.add(new Player("Koen", 26));
        players.add(new Player("Kurt", 18));
        players.add(new Player("Tom", 22));
        players.add(new Player("Koen", 34));

        Comparator<Player> playerComparator = comparing(Player::getName).thenComparing(Player::getAge);
        players.stream().sorted(playerComparator).forEach( p -> System.out.println(p.getName()+", "+p.getAge()));

    }


}
