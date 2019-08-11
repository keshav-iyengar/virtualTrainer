package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewWorkoutPanel {

	public NewWorkoutPanel() {

	}

	public JPanel createNewWorkoutPanel() {

		JCheckBox option1 = new JCheckBox("Option 1");
		JCheckBox option2 = new JCheckBox("Option 2");

		JPanel panel = new JPanel();

		option1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (option1.isSelected())
					System.out.println(option1.getText() + " selected.");

			}
		});

		option2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (option2.isSelected())
					System.out.println(option2.getText() + " selected.");

			}
		});

		panel.add(new JLabel("Fitness goals: "));
		panel.add(option1);
		panel.add(option2);
		panel.add(new JLabel("Preferred workout duration: "));

		return panel;

	}
}
