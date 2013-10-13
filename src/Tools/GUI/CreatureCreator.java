package Tools.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: Matt
 * Date: 12/10/13
 * Time: 21:24
 * To change this template use File | Settings | File Templates.
 */
public class CreatureCreator implements ActionListener {
    private JTextField textCreatureName;
    private JTextField textHealth;
    private JTextField textBaseIntelligence;
    private JTextField textBaseStrength;
    private JButton btnSave;
    private JButton btnNew;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JTextField textBaseMagic;

    private void createUIComponents() {
        // Text containers to hold the stats
        textCreatureName = new JTextField("Deadly Creature Name");
        textHealth = new JTextField("100");
        textBaseIntelligence = new JTextField("0");
        textBaseStrength = new JTextField("0");
        textBaseMagic = new JTextField("0");

        //Setup the buttons on the toolbar to do things!
        btnSave = new JButton();
        btnNew = new JButton();
        btnSave.setActionCommand("save");
        btnSave.addActionListener(this);
        btnNew.setActionCommand("new");
        btnSave.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
