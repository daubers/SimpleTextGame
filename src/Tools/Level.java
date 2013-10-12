package Tools;

import GameObjects.Enemy;
import GameObjects.PuzzleObject;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Matt
 * Date: 09/10/13
 * Time: 19:22
 * To change this template use File | Settings | File Templates.
 */
public class Level {
    /*
     *
     * This describes a level for the game
     * and contains tools to export to an xml document
     * and load from an xml document as well
     *
     */
    List<PuzzleObject> items = new ArrayList<PuzzleObject>();
    List<Enemy> enemies = new ArrayList<Enemy>();

}
