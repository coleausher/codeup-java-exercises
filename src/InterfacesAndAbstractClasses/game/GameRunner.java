package InterfacesAndAbstractClasses.game;

public class GameRunner {
//    private MarioGame game;
//    private SuperContraGame game;
//    private GamingConsole game;
    private PackmanGame game;

}
//public GameRunner(MarioGame game) {
//    this.game = game;
//}

    public GameRunner(PackmanGame game) {
    this.game = game;
    }

public void run(){
    game.up();
    game.down();
    game.left();
    game.right();
}