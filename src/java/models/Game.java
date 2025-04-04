package java.models;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;

    private Player winner;
    private int nextPlayerIndex;
    private GameState gameState;
}
