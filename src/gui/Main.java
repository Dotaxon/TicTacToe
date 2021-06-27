package gui;

import java.awt.EventQueue;

public class Main {

	private static StartGUI frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new StartGUI();
					getFrame().setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	
	
	
	
	public static StartGUI getFrame() {
		return frame;
	}
}
