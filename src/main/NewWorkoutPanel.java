package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class NewWorkoutPanel {

	ArrayList<String> selectedOptions = new ArrayList<String>();
	JPanel newWorkoutPanel = new JPanel();

	public NewWorkoutPanel() {

		ArrayList<String> options = new ArrayList<String>() {
			{
				add("Build muscle");
				add("Burn fat");
			}
		};
		createOptionsGroup("Fitness goals:", options, false, true);

		options.clear();
		options.addAll(Arrays.asList(".5 hrs", "1 hr", "1.5 hrs", "2+ hrs"));
		createOptionsGroup("Preferred workout duration:", options, true, false);

	}

	public JPanel getPanel() {

		return this.newWorkoutPanel;

	}

	/*
	 * Sets up an option group.
	 * 
	 * @param _label the prompt for the options
	 * 
	 * @param options the list of responses for the prompt
	 */
	public void createOptionsGroup(String _label, ArrayList<String> options, boolean isRadioButtonGroup,
			boolean isCheckBoxGroup) {

		JLabel label = new JLabel(_label);
		newWorkoutPanel.add(label);

		if (isCheckBoxGroup) {
			ArrayList<JCheckBox> checkBoxGroup = makeCheckBoxGroup(options);
			for (JCheckBox checkBox : checkBoxGroup)
				newWorkoutPanel.add(checkBox);
		} else {
			ArrayList<JRadioButton> radioButtonGroup = makeRadioButtonGroup(options);
			for (JRadioButton radioButton : radioButtonGroup)
				newWorkoutPanel.add(radioButton);
		}

	}

	/*
	 * Establishes a list of checkbox options and adds action listeners to them.
	 */
	public ArrayList<JCheckBox> makeCheckBoxGroup(ArrayList<String> options) {

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

	public ArrayList<JRadioButton> makeRadioButtonGroup(ArrayList<String> options) {

		JRadioButton radioButton;
		ArrayList<JRadioButton> radioButtonGroup = new ArrayList<JRadioButton>();

		for (String option : options) {

			radioButton = new JRadioButton(option);
			radioButtonGroup.add(radioButton);

		}

		for (JRadioButton button : radioButtonGroup) {

			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(button.getText() + " is selected");
				}
			});

		}

		return radioButtonGroup;

	}

}
