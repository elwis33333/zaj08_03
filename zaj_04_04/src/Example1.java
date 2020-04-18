import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {


        List<BoardGame> games = Arrays.asList(
                new BoardGame("Terraforming Mars", 8.38, new BigDecimal("123.49"), 1, 5),
                new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8),
                new BoardGame("Puerto Rico", 8.07, new BigDecimal("149.99"), 2, 5),
                new BoardGame("Terra Mystica", 8.26, new BigDecimal("252.99"), 2, 5),
                new BoardGame("Scythe", 8.3, new BigDecimal("314.95"), 1, 5),
                new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6),
                new BoardGame("7 Wonders Duel", 8.15, new BigDecimal("109.95"), 2, 2),
                new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4),
                new BoardGame("Patchwork", 7.77, new BigDecimal("75"), 2, 2),
                new BoardGame("The Castles of Burgundy", 8.12, new BigDecimal("129.95"), 2, 4)
        );
        //rozwiązanie bez stream
        for (BoardGame game : games) {
            if (game.maxPlayers > 4) {
                if (game.rating > 8) {
                    if (new BigDecimal(150).compareTo(game.price) > 0) {
                        System.out.println(game.name.toUpperCase());
                    }
                }
            }
        }
        //strumieniem
        games.stream()
                .filter(g->g.maxPlayers >4)
                .filter(g->g.rating >8)
                .filter(g->new BigDecimal(150).compareTo(g.price) >0)
                .map(g->g.name.toUpperCase())
                .forEach(System.out::println);
        games.stream()
                .filter(g->g.maxPlayers >4)
                .filter(g->g.rating >8)
                .filter(g->new BigDecimal(150).compareTo(g.price) >0)
                .forEach(System.out::println);
    }
}