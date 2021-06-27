package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reset implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent args) {
		
		for (int i = 0; i < StartGUI.btn.length; i++) {
			StartGUI.state[i] = 0;			
			StartGUI.btn[i].setIcon(null);
		}
		StartGUI.changeBeginnerPlayer();
		StartGUI.setActivePlayer(StartGUI.getBeginnerPlayer());
		new Refresh();
	}

}
