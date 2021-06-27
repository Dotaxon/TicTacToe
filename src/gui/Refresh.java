package gui;

public class Refresh {

	public Refresh() {
		StartGUI.setPnlActivePlayer("Player: " + StartGUI.getPlayerAsLetter(StartGUI.getActivePlayer()));
	}
}
