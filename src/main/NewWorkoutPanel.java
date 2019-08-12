package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewWorkoutPanel {

	ArrayList<String> selectedOptions = new ArrayList<String>();

	public NewWorkoutPanel() {

	}

	public JPanel createNewWorkoutPanel() {

		JCheckBox buildMuscleCheckbox = new JCheckBox("Build muscle");
		JCheckBox burnFatCheckbox = new JCheckBox("Burn fat");

		JPanel newWorkoutPanel = new JPanel();

		buildMuscleCheckbox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		burnFatCheckbox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		newWorkoutPanel.add(new JLabel("Fitness goals: "));

		String[] options = { "Build muscle", "Burn fat" };
		ArrayList<JCheckBox> checkBoxGroup = makeCheckBoxGroup(options);
		for (JCheckBox checkBox : checkBoxGroup)
			newWorkoutPanel.add(checkBox);

		newWorkoutPanel.add(new JLabel("Preferred workout duration: "));

		return newWorkoutPanel;

	}

	public ArrayList<JCheckBox> makeCheckBoxGroup(String[] options) {

		JCheckBox checkBox;
		ArrayList<JCheckBox> checkBoxGroup = new ArrayList<JCheckBox>();

		for (String option : options) {

			checkBox = new JCheckBox(option);
			checkBoxGroup.add(checkBox);

		}

		for (JCheckBox box : checkBoxGroup) {

			box.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(box.getText() + " is selected");
				}
			});

		}

		return checkBoxGroup;

	}

}
