package view;

import control.MainController;
import model.Employee;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelHandler {
    private JPanel panel;
    private JLabel nLabel;
    private JLabel gLabel;
    private JLabel bLabel;
    private JLabel pLabel;
    private JLabel sLabel;
    private JLabel nameLabel;
    private JLabel branchLabel;
    private JLabel positionLabel;
    private JLabel salaryLabel;
    private JButton nameButton;
    private JButton branchButton;
    private JButton positionButton;
    private JButton salaryButton;
    private JTextField nameTextField;
    private JTextField branchTextField;
    private JTextField positionTextField;
    private JTextField SalaryTextField;
    private JComboBox genderComboBox;
    private JLabel genderLabel;

    private MainController mainController;

    public PanelHandler(MainController mainController) {
        this.mainController = mainController;
        createButtons();

        updateGUI();
    }

    private void createButtons(){
        nameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainController.setEmployeeName(nameTextField.getText());
                updateGUI();
            }
        });
        branchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainController.setBranch(branchTextField.getText());
                updateGUI();
            }
        });
        positionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainController.setPosition(positionTextField.getText());
                updateGUI();
            }
        });
        salaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainController.setSalary(SalaryTextField.getText());
                updateGUI();
            }
        });
        genderComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainController.setGender(genderComboBox.getSelectedItem());
                updateGUI();
            }
        });

    }

    private void updateGUI(){
        nameLabel.setText(mainController.getEmployeeName());
        branchLabel.setText(mainController.getBranch());
        positionLabel.setText(mainController.getPosition());
        salaryLabel.setText(mainController.getSalary());
    }

    public JPanel getPanel(){
        return panel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
