package interfaces;

/**
 * Created by weixiao on 2018/9/14.
 */

interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {
    private int moves = 0;
    private static final int MOVES = 3;
    public boolean move() {
        System.out.println("Checks move " +moves);
        return ++moves != MOVES;
    }
}

class CheckersFactory implements GameFactory {
    public Game getGame(){
        return new Checkers();
    }
}

class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;
    public boolean move(){
        System.out.println("Chess move " +moves);
        return ++moves != MOVES;
    }
}

class ChessFactory implements GameFactory{
    public Game getGame(){
        return new Chess();
    }

}
public class Games {
    public static void playGame(GameFactory factory){
        Game s = factory.getGame();
        while (s.move());
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}/*output:
Checks move 0
Checks move 1
Checks move 2
Chess move 0
Chess move 1
Chess move 2
Chess move 3
*/
