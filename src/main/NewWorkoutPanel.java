package main;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class NewWorkoutPanel {

	HashMap<String, Boolean> selectedOptions = new HashMap<String, Boolean>();
	JPanel newWorkoutPanel = new JPanel(new GridBagLayout());
	GridBagConstraints layoutConstraints = new GridBagConstraints();

	public NewWorkoutPanel() {

		ArrayList<String> options = new ArrayList<String>() {
			{
				add("Build muscle");
				add("Burn fat");
			}
		};
		layoutConstraints.anchor = GridBagConstraints.NORTH;
		layoutConstraints.weighty = 0.3;
		createOptionsGroup("Fitness goals:", options, false, true, layoutConstraints);

		options.clear();
		options.addAll(Arrays.asList(".5 hrs", "1 hr", "1.5 hrs", "2+ hrs"));
		layoutConstraints.gridy = 1;
		layoutConstraints.weighty = 7.0;
		createOptionsGroup("Preferred workout duration:", options, true, false, layoutConstraints);

		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Trainer trainer = new Trainer(selectedOptions);
			}
		});

		layoutConstraints.gridy = 2;
		newWorkoutPanel.add(submitButton, layoutConstraints);

	}

	public JPanel getPanel() {

		return this.newWorkoutPanel;

	}

	/*
	 * Sets up an option group and adds it to the panel.
	 * 
	 * @param _label the prompt for the options
	 * 
	 * @param options the list of responses for the prompt
	 */
	public void createOptionsGroup(String _label, ArrayList<String> options, boolean isRadioButtonGroup,
			boolean isCheckBoxGroup, GridBagConstraints constraints) {

		JLabel label = new JLabel(_label);
		newWorkoutPanel.add(label, constraints);

		if (isCheckBoxGroup) {
			ArrayList<JCheckBox> checkBoxGroup = makeCheckBoxGroup(options);
			for (JCheckBox checkBox : checkBoxGroup)
				newWorkoutPanel.add(checkBox, constraints);
		} else {
			ArrayList<JRadioButton> radioButtonGroup = makeRadioButtonGroup(options);
			ButtonGroup group = new ButtonGroup();
			for (JRadioButton radioButton : radioButtonGroup) {
				group.add(radioButton);
				newWorkoutPanel.add(radioButton, constraints);
			}
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
					if (box.isSelected())
						selectedOptions.put(box.getText(), true);
					else
						selectedOptions.put(box.getText(), false);
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
					if (button.isSelected())
						selectedOptions.put(button.getText(), true);
					else
						selectedOptions.put(button.getText(), false);
				}
			});

		}

		return radioButtonGroup;

	}

}
