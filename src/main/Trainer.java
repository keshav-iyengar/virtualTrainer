package main;

import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Trainer {

	HashMap<String, Boolean> userWorkoutData;

	public Trainer(HashMap<String, Boolean> data) {

		userWorkoutData = data;
		JFrame frame = new JFrame();
		frame.add(new JLabel("Test"));
		frame.setVisible(true);

	}

}
