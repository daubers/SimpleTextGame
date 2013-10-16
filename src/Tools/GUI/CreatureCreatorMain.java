package Tools.GUI;

import GUI.MainGui;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Matt
 * Date: 16/10/13
 * Time: 21:00
 * To change this template use File | Settings | File Templates.
 */
public class CreatureCreatorMain {
    private static CreatureCreator gui;
    public static void main(String[] args){
        gui = new CreatureCreator();
        JFrame frame = new JFrame("MainGui");
        frame.setContentPane(gui.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
