package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;

public class StartGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7167567228458189982L; //keine Ahnung wo für das gut ist
	/**
	 * 
	 */
	private JPanel contentPane;				//Das Feld auf dem Alles drauf ist
	static JButton btn[] = new JButton[9]; //Die Knöpfe des Spielfeldes
	static int state[] = new int[9];	//Status der Knöpfe des Spielfeldes
										//0 = nichts; 1 = Player 1/X ; 2 = Player 2/O
	
	private static int beginnerPlayer;	//Spieler der die Runde begint
	private static int activePlayer;	//Spieler der andere Reihe ist
	private static Icon x = new ImageIcon("./res/x.png"); //activePlayer 1 is X
	private static Icon o = new ImageIcon("./res/o.png"); //activePlayer 2 is O
	private static JLabel pnlActivePlayer; //Panel das Anzeigt welcher Spieler an der Reihe ist
	static JButton btnReset; //Knopf der Spiel resetet



	/**
	 * Create the frame.
	 */
	public StartGUI() {
		setTitle("TicTacToe by Vincent Olbring");

		setBeginnerPlayer(new Random().nextInt(2)+1); //returns 1 or 2 bestimmt beginner Spieler
		setActivePlayer(getBeginnerPlayer()); //Am Anfang activePlayer = beginnerPlayer
		
		
		setResizable(false);		//Damit man keine Skalierungs fehler bekommt kein Resizing
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 728);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);   //null = Absolutes Layout
		
		//In diesem Panel sind die Knöpfe
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(257, 11, 670, 667);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 5, 5));
		
		//Knopf zum Reseten
		btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnReset.setBounds(34, 616, 169, 49);
		btnReset.addActionListener(new Reset());
		contentPane.add(btnReset);
		
		//Panel das Anzeigt welcher Spieler an der Reihe ist
		pnlActivePlayer = new JLabel();
		pnlActivePlayer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pnlActivePlayer.setBounds(34, 36, 169, 60);
		pnlActivePlayer.setText("Player: " + getPlayerAsLetter(activePlayer)); //e.g. Player: X
		contentPane.add(pnlActivePlayer);
		
		
		
		//Hier werden die Knöpfe des Spielfeldes Initalisiert
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton();
			btn[i].setBackground(Color.WHITE);
//			btn[i].setText(String.valueOf(i));
			btn[i].addActionListener(new ButtonAction());
			panel.add(btn[i]);
		}



	}


	public static String getPlayerAsLetter(int player) {
		
		if(player == 1)
		{
			return "X";
		}
		else if(player == 2)
		{
			return "O";
		}
		else
		{
			return "error";
		}
	}
	public static int getActivePlayer() {
		return activePlayer;
	}
	public static void setActivePlayer(int activePlayer) {
		StartGUI.activePlayer = activePlayer;
	}

	public static Icon getXIcon() {
		return x;
	}

	public static Icon getOIcon() {
		return o;
	}

	public static int getBeginnerPlayer() {
		return beginnerPlayer;
	}

	public static void setBeginnerPlayer(int beginnerPlayer) {
		StartGUI.beginnerPlayer = beginnerPlayer;
	}
	public static void changeBeginnerPlayer() {
		if(beginnerPlayer == 1) 
		{
			beginnerPlayer = 2;
		}
		else if (beginnerPlayer == 2)
		{
			beginnerPlayer = 1;
		}
	}
	public static void setPnlActivePlayer(String text) {
		pnlActivePlayer.setText(text);
	}
}
