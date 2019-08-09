package main;

public class Main {
	
	public static void main(String[] args) {
			
			MainScreen mainScreen = new MainScreen("VirtualTrainer");
			
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                mainScreen.createAndShowGUI();
	            }
	        });
			
	}

}
