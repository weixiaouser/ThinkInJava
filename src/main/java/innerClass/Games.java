package innerClass;

/**
 * Created by weixiao on 2018/9/18.
 * Using anonymous inner classes with the game framework
 */

interface Game{
    boolean move();
}
interface GameFactory{
    Game getGame();
}
class Checkers implements Game {
    private Checkers(){}
    private int moves = 0;
    private static final int MOVES = 3;
    public boolean move(){
        System.out.println("CHeckers move "+moves);
        return ++moves != MOVES;
    }
    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };
}

class Chess implements Game {
    private Chess(){}
    private int moves = 0;
    private static final int MOVES = 4;
    public boolean move(){
        System.out.println("Chess move "+moves);
        return ++moves !=MOVES;
    }
    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}
public class Games {
    public static void playGame(GameFactory factory){
        Game s = factory.getGame();
        while (s.move());
    }

    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }
}/*output:
CHeckers move 0
CHeckers move 1
CHeckers move 2
Chess move 0
Chess move 1
Chess move 2
Chess move 3
*/
