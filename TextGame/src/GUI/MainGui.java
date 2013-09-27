package GUI;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Matt
 * Date: 27/09/13
 * Time: 20:21
 * To change this template use File | Settings | File Templates.
 */
public class MainGui{

    private JTextArea outputTextArea;
    private JTextField inputTextField;
    private JButton btnDoIt;
    private JPanel MainPanel;

    public MainGui() {

    }

    public JPanel getMainPanel() {
        return MainPanel;
    }

    public JTextArea getOutputTextArea() {
        return outputTextArea;
    }

    public JTextField getInputTextField() {
        return inputTextField;
    }

    public JButton getBtnDoIt() {
        return btnDoIt;
    }

    private void createUIComponents() {
        MainPanel = new JPanel();
        outputTextArea = new JTextArea("Test");
    }

    private void $$$setupUI$$$() {
        createUIComponents();
    }
}
