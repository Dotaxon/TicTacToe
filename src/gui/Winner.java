package gui;

import javax.swing.JOptionPane;

public class Winner {
	public Winner(int wonPlayer) {
		JOptionPane.showMessageDialog(Main.getFrame(), ("Player " + StartGUI.getPlayerAsLetter(wonPlayer)+ " has won!"), "Winner", JOptionPane.INFORMATION_MESSAGE);
		StartGUI.btnReset.doClick();
	}
}
