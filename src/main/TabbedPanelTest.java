package main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPanelTest {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		// JTextArea ta = new JTextArea(200, 200);
		NewWorkoutPanel newWorkoutPanel = new NewWorkoutPanel();
		JPanel p1 = newWorkoutPanel.getPanel();
//		p1.add(ta);
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JTabbedPane tp = new JTabbedPane();
		tp.setBounds(50, 50, 200, 200);
		tp.add("main", p1);
		tp.add("visit", p2);
		tp.add("help", p3);
		f.setLayout(new BorderLayout());
		f.add(tp, BorderLayout.CENTER);
		f.setSize(800, 800);
		f.setVisible(true);

	}

}
