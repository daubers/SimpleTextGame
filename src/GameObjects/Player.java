package GameObjects;

/**
 * Created with IntelliJ IDEA.
 * User: Matt
 * Date: 27/09/13
 * Time: 20:24
 * To change this template use File | Settings | File Templates.
 */
public class Player {
    private Position position;
    private String name;

    public Player(){
        position = new Position(0,0);
    }
    public void setName(String name){
        this.name = name;
    }

    public String name(){
        return name;
    }

    public Position getPosition(){
        return position;
    }

    public void setPosition(Position position){
        this.position = position;
    }

}
