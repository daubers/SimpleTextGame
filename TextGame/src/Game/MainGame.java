package Game;

import GUI.MainGui;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Matt
 * Date: 27/09/13
 * Time: 21:12
 * To change this template use File | Settings | File Templates.
 */
public class MainGame {
    private static MainGui gui;
    public static void main(String[] args){
        gui = new MainGui();
        JFrame frame = new JFrame("MainGui");
        frame.setContentPane(gui.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
