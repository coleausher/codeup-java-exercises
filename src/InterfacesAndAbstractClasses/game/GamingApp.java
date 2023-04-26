package InterfacesAndAbstractClasses.game;

public class GamingApp {
    public static void main(String[] args) {
//        MarioGame game = new MarioGame();


//        SuperContraGame game = new SuperContraGame();

//        PackmanGame game = new PackmanGame();

        GamingConsole game = new PackmanGame();
        GameRunner runner = new GameRunner(game);

        runner.run();

    }
}
