package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: Matt
 * Date: 27/09/13
 * Time: 20:21
 * To change this template use File | Settings | File Templates.
 */
public class MainGui implements ActionListener{

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
        outputTextArea = new JTextArea();
        inputTextField = new JTextField();
        btnDoIt = new JButton();
        btnDoIt.setActionCommand("doit");
        btnDoIt.addActionListener(this);
        inputTextField.setActionCommand("doit");
        inputTextField.addActionListener(this);
    }

    private void $$$setupUI$$$() {
        createUIComponents();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd == "doit"){
            outputTextArea.append(inputTextField.getText()+"\n");
            inputTextField.setText("");
        }
    }
}
