package gui;

public class CheckForWin {
	boolean win;
	int wonPlayer;
	public CheckForWin() {
		win = false;
		wonPlayer = 0;
		
		//Kontrolliert Horizontal
		for (int i = 0; i <9; i += 3) 
		{
			if(StartGUI.state[i] == 1 && StartGUI.state[i+1] == 1 && StartGUI.state[i+2] == 1) 
			{
				win = true;
				wonPlayer = 1;
				break;
			}
			if(StartGUI.state[i] == 2 && StartGUI.state[i+1] == 2 && StartGUI.state[i+2] == 2) 
			{
				win = true;
				wonPlayer = 2;
				break;
			}
		}
		
		//Kontrolliert Vertikale
		for (int i = 0; i < 3; i++) 
		{
			if(StartGUI.state[i] == 1 && StartGUI.state[i+3] == 1 && StartGUI.state[i+6] == 1) 
			{
				win = true;
				wonPlayer = 1;
				break;
			}
			if(StartGUI.state[i] == 2 && StartGUI.state[i+3] == 2 && StartGUI.state[i+6] == 2) 
			{
				win = true;
				wonPlayer = 2;
				break;
			}
		}
		
		//Kontrolliert Diagonale
		if(StartGUI.state[0] == 1 && StartGUI.state[4] == 1 && StartGUI.state[8] == 1) 
		{
			win = true;
			wonPlayer = 1;
		}
		else if(StartGUI.state[0] == 2 && StartGUI.state[4] == 2 && StartGUI.state[8] == 2)
		{
			win = true;
			wonPlayer = 2;
		}
		else if(StartGUI.state[2] == 1 && StartGUI.state[4] == 1 && StartGUI.state[6] == 1) 
		{
			win = true;
			wonPlayer = 1;
		}
		else if(StartGUI.state[2] == 2 && StartGUI.state[4] == 2 && StartGUI.state[6] == 2)
		{
			win = true;
			wonPlayer = 2;
		}
		
		if(win) {
//			System.out.println("won player:" + wonPlayer);
			new Winner(wonPlayer);
		}
	}
}
