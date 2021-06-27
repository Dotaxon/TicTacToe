package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent args) {

		int activePlayer = StartGUI.getActivePlayer();
		
		
		for (int i = 0; i < StartGUI.btn.length; i++)///// 
		{												//// wählt den Richtigen Button aus
														////
			if(StartGUI.btn[i] == args.getSource()) //////
			{
//				System.out.println("iamin");		
				
				if(StartGUI.state[i] != 0) return;	//Stopt wenn Feld schon belegt
				StartGUI.state[i] = activePlayer;
				
//				System.out.println(activePlayer);
				
				if(activePlayer == 1) 
				{
					StartGUI.btn[i].setIcon(StartGUI.getXIcon());
					StartGUI.setActivePlayer(2);
				}
				else if(activePlayer == 2)
				{
					StartGUI.btn[i].setIcon(StartGUI.getOIcon());
					StartGUI.setActivePlayer(1);
				}
				else {
					System.out.println("error");
				}
				new Refresh();
				new CheckForWin();
				return;
			}
			
		}
//		if(args.getSource() == StartGUI.btn[0]) {
//			System.out.println("endlich");
//		}
//		if(args.getSource() == StartGUI.btnNewButton) {
//			System.out.println("endlich2");
//		}
//		
		
	}


}
