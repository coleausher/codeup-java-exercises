package InterfacesAndAbstractClasses.game;

public class SuperContraGame implements GamingConsole{
    public void up(){
        System.out.println("Aim weapon upwards");
    }
    public void down(){
        System.out.println("Crouch");
    }
    public void left(){
        System.out.println("Move backward and aim weapon backward");
    }
    public void right(){
        System.out.println("Move Forward and aim weapon forward");
    }
}
