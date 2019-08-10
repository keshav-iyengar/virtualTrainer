package main;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class MainScreen {
	
	String windowTitle;

	public MainScreen(String title) {
		
		this.windowTitle = title;
		
	}
	
	public void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame(this.windowTitle);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Declare the layout constraints object
        Container frameContentPane = frame.getContentPane();
        frameContentPane.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        
        //Declare the buttons
        JButton homeButton = new JButton("Home");
        JButton newWorkoutButton = new JButton("New workout");
        
        //Create a panel to contain the buttons
        JPanel buttonPanel = new JPanel();
        
        //Add the buttons to the panel
        buttonPanel.add(homeButton);
        buttonPanel.add(newWorkoutButton);
        
        JLabel homeLabel = new JLabel("Home");
        JPanel homePanel = new JPanel();
        homePanel.add(homeLabel);
        
        JLabel workoutLabel = new JLabel("New workout");
        JPanel workoutPanel = new JPanel();
        workoutPanel.add(workoutLabel);
        workoutPanel.setVisible(false);
        
        homeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	homePanel.setVisible(true);
            	workoutPanel.setVisible(false);
           
            }
        });
        
        newWorkoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	homePanel.setVisible(false);
            	workoutPanel.setVisible(true);
           
            }
        });
        
        //Add the card to the JFrame
        constraints.gridy = 0; //first row
        frameContentPane.add(new JLabel("Welcome to Virtual Trainer!"), constraints);
        constraints.gridy = 1; //second row
        frameContentPane.add(new JLabel("Please select one of the options below."), constraints);
        constraints.gridy = 2;
        frameContentPane.add(buttonPanel, constraints);
        constraints.gridy = 3;        
        frameContentPane.add(homePanel, constraints);
        frameContentPane.add(workoutPanel, constraints);
        
        //Display the window.
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
		
//	public JPanel createButtonCard() {
//
//        JButton button1 = new JButton("Button 1");
//        JButton button2 = new JButton("Button 2");
//        
//        final CardLayout cardLayout = new CardLayout();
//        JPanel card = new JPanel(cardLayout);
//        
//        button1.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//            	
//            	
//
//            }
//        });
//        
//        
//        card.add(button1);
//        card.add(button2);
//        return card;
//	}
	
}
