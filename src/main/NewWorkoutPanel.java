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

		JCheckBox buildMuscleCheckbox = new JCheckBox("Build muscle");
		JCheckBox burnFatCheckbox = new JCheckBox("Burn fat");

		JPanel newWorkoutPanel = new JPanel();

		buildMuscleCheckbox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (buildMuscleCheckbox.isSelected())
					System.out.println(buildMuscleCheckbox.getText() + " selected.");

			}
		});

		burnFatCheckbox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (burnFatCheckbox.isSelected())
					System.out.println(burnFatCheckbox.getText() + " selected.");

			}
		});

		newWorkoutPanel.add(new JLabel("Fitness goals: "));
		newWorkoutPanel.add(buildMuscleCheckbox);
		newWorkoutPanel.add(burnFatCheckbox);
		newWorkoutPanel.add(new JLabel("Preferred workout duration: "));

		return newWorkoutPanel;

	}
}
