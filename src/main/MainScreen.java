package main;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainScreen {

	String windowTitle;

	public MainScreen(String title) {

		this.windowTitle = title;

	}

	public void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame(this.windowTitle);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Declare the layout constraints object
		Container frameContentPane = frame.getContentPane();
		frameContentPane.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();

		// Declare the buttons
		JButton homeButton = new JButton("Home");
		JButton newWorkoutButton = new JButton("New workout");

		// Create a panel to contain the buttons
		JPanel buttonPanel = new JPanel();

		// Add the buttons to the panel
		buttonPanel.add(homeButton);
		buttonPanel.add(newWorkoutButton);

		JLabel homeLabel = new JLabel("Home");
		JPanel homePanel = new JPanel();
		homePanel.add(homeLabel);

		NewWorkoutPanel newWorkoutPanel = new NewWorkoutPanel();
		JPanel workoutPanel = new JPanel();
		workoutPanel.add(newWorkoutPanel.getPanel());
		workoutPanel.setVisible(false);

		homeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				homePanel.setVisible(true);
				workoutPanel.setVisible(false);

			}
		});

		newWorkoutButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				homePanel.setVisible(false);
				workoutPanel.setVisible(true);

			}
		});

		// Add the card to the JFrame
		// constraints.gridy = 0; // first row
		constraints.anchor = GridBagConstraints.NORTH;
		constraints.weighty = 0.3;
		frameContentPane.add(new JLabel("Welcome to Virtual Trainer!"), constraints);
		constraints.weighty = 7.0;
		constraints.gridy = 1;
		frameContentPane.add(new JLabel("Please select one of the options below."), constraints);
		constraints.gridy = 2;
		frameContentPane.add(buttonPanel, constraints);
		constraints.gridy = 3;
		frameContentPane.add(homePanel, constraints);
		frameContentPane.add(workoutPanel, constraints);

		// Display the window.
		frame.setSize(600, 600);
		// frame.pack();
		frame.setVisible(true);
	}

}
