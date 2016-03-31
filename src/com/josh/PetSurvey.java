package com.josh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by ec0662sr on 3/31/2016.
 */
public class PetSurvey extends JFrame {
    private JPanel rootPanel;
    private JCheckBox dogCheckBox;
    private JCheckBox catCheckBox;
    private JCheckBox fishCheckBox;
    private JButton submitButton;
    private JLabel surveyResultsLabel;
    private JButton quitButton;

    private boolean hasDogs;
    private boolean hasCats;
    private boolean hasFish;

    public PetSurvey() {

        super("Pet survey application");
        setContentPane(rootPanel);
        setPreferredSize(new Dimension(300, 300));  //has to be before pack()//sets the size of the window in pixels
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);






        fishCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                hasFish = fishCheckBox.isSelected();
            }
        });
        catCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                hasCats = catCheckBox.isSelected();
            }
        });
        dogCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                hasDogs = dogCheckBox.isSelected();
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dog = (hasDogs) ? "a dog" : "no dogs";
                String cat = (hasCats) ? "a cat" : "no cats";
                String fish = (hasFish) ? "a fish" : "no fish";

//                if (hasFish == true) {
//                    fish = "a fish";
//                } else {                       //this is another way of writing above statements//
//                    fish = "no fish";
//                }



                String surveyResult = "User has " + dog + " and " + cat + " and " + fish;

                surveyResultsLabel.setText(surveyResult);



            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
