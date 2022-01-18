package com.dice_poker;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.dice_poker.RunGame.ChoiceHandler;

/**
 * Creates the user interface of the game
 * @author Divine Grace Lavente
 *
 */
public class UserInterface {
	
	JFrame window;
	JPanel titlepanel,  startpanel,  gamepanel,  backpanel,  fplayerrollpanel,  fplayerpanel,  
	splayerrollpanel,  splayerpanel,  resultpanel,  newgamepanel;
	JLabel title,  rankpanel,  fplayerlabel,  splayerlabel,  fplayerhandlabel,  
	fplayerhandtypelabel,  splayerhandlabel,  splayerhandtypelabel,  resultlabel;
	JButton startbutton,  rankbutton,  backbutton,  fplayerrollbutton, 
	splayertturnbutton,  newgamebutton;
	ImageIcon handrank;
	Font titlefont = new Font("Century Gothic",  Font.PLAIN,  90);
	Font normalfont = new Font("Century Gothic",  Font.PLAIN,  25);
	CreateHand fplayerhand,  splayerhand;
	int fplayerhandtype,  splayerhandtype;
	
	/**
	 * Creates the User Interface
	 * @param choice Representation of player's action
	 */
	public void createUI(ChoiceHandler choice) {
		window = new JFrame();
		window.setSize(850, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		window.setResizable(false);
		
		titlepanel = new JPanel();
		titlepanel.setBounds(115, 100, 600, 100);
		titlepanel.setBackground(Color.black);
		title = new JLabel("DICE POKER");
		title.setForeground(Color.white);
		title.setFont(titlefont);
		titlepanel.add(title);
		
		startpanel = new JPanel();
		startpanel.setBounds(265,  350,  300,  100);
		startpanel.setBackground(Color.black);
		startpanel.setLayout(new GridLayout(2, 1));
		
		startbutton = new JButton("Start");
		startbutton.setBackground(Color.black);
		startbutton.setForeground(Color.white);
		startbutton.setFont(normalfont);
		startbutton.addActionListener(choice);
		startbutton.setActionCommand("start");
		startpanel.add(startbutton);
		
		rankbutton = new JButton("Check Hierarchy");
		rankbutton.setBackground(Color.black);
		rankbutton.setForeground(Color.white);
		rankbutton.setFont(normalfont);
		rankbutton.addActionListener(choice);
		rankbutton.setActionCommand("rank");
		startpanel.add(rankbutton);
		
		window.add(titlepanel);
		window.add(startpanel);
		
		rankpanel = new JLabel();
		rankpanel.setBounds(40, 50, 800, 450);
		rankpanel.setBackground(Color.black);
		handrank = new ImageIcon("C:\\Users\\itsmenavi009\\eclipse-workspace\\DicePoker\\"
				+ "res\\dicepoker_handrank.png");
		rankpanel.setIcon(handrank);

		backpanel = new JPanel();
		backpanel.setBounds(700, 500, 100, 50);
		backpanel.setBackground(Color.black);
		backbutton = new JButton("Back");
		backbutton.setBackground(Color.black);
		backbutton.setForeground(Color.white);
		backbutton.setFont(normalfont);
		backbutton.addActionListener(choice);
		backbutton.setActionCommand("back");
		backpanel.add(backbutton);
		
		window.add(rankpanel);
		window.add(backpanel);

		gamepanel = new JPanel();
		gamepanel.setBounds(50, 100, 200, 200);
		gamepanel.setLayout(new GridLayout(2, 1));
		gamepanel.setBackground(Color.black);
		
		fplayerlabel = new JLabel("Player 1 Hand: ");
		fplayerlabel.setForeground(Color.white);
		fplayerlabel.setFont(normalfont);
		gamepanel.add(fplayerlabel);
		splayerlabel = new JLabel("Player 2 Hand: ");
		splayerlabel.setForeground(Color.white);
		splayerlabel.setFont(normalfont);
		gamepanel.add(splayerlabel);
		
		window.add(gamepanel);

		fplayerrollpanel = new JPanel();
		fplayerrollpanel.setBounds(315, 320, 190, 50);
		fplayerrollpanel.setBackground(Color.black);
		fplayerrollbutton = new JButton("Player 1 Turn");
		fplayerrollbutton.setBackground(Color.black);
		fplayerrollbutton.setForeground(Color.white);
		fplayerrollbutton.setFont(normalfont);
		fplayerrollbutton.addActionListener(choice);
		fplayerrollbutton.setActionCommand("player1");
		fplayerrollpanel.add(fplayerrollbutton);
		
		window.add(fplayerrollpanel);
		
		fplayerpanel = new JPanel();
		fplayerpanel.setBounds(300, 100, 600, 100);
		fplayerpanel.setLayout(new GridLayout(1, 2));
		fplayerpanel.setBackground(Color.black);
		fplayerhandlabel = new JLabel();
		fplayerhandlabel.setForeground(Color.white);
		fplayerhandlabel.setFont(normalfont);
		fplayerhandtypelabel = new JLabel();
		fplayerhandtypelabel.setForeground(Color.white);
		fplayerhandtypelabel.setFont(normalfont);
		fplayerpanel.add(fplayerhandlabel);
		fplayerpanel.add(fplayerhandtypelabel);
		
		window.add(fplayerpanel);
		
		splayerrollpanel = new JPanel();
		splayerrollpanel.setBounds(315, 320, 190, 50);
		splayerrollpanel.setBackground(Color.black);
		splayertturnbutton = new JButton("Player 2 Turn");
		splayertturnbutton.setBackground(Color.black);
		splayertturnbutton.setForeground(Color.white);
		splayertturnbutton.setFont(normalfont);
		splayertturnbutton.addActionListener(choice);
		splayertturnbutton.setActionCommand("player2");
		splayerrollpanel.add(splayertturnbutton);
		
		window.add(splayerrollpanel);
		
		splayerpanel = new JPanel();
		splayerpanel.setBounds(300, 200, 600, 100);
		splayerpanel.setLayout(new GridLayout(1, 2));
		splayerpanel.setBackground(Color.black);
		splayerhand = new CreateHand();
		splayerhandlabel = new JLabel();
		splayerhandlabel.setForeground(Color.white);
		splayerhandlabel.setFont(normalfont);
		splayerhandtypelabel = new JLabel();
		splayerhandtypelabel.setForeground(Color.white);
		splayerhandtypelabel.setFont(normalfont);
		splayerpanel.add(splayerhandlabel);
		splayerpanel.add(splayerhandtypelabel);
		
		window.add(splayerpanel);

		resultpanel = new JPanel();
		resultpanel.setBounds(110, 400, 600, 50);
		resultpanel.setBackground(Color.black);
		resultlabel = new JLabel();
		resultlabel.setForeground(Color.white);
		resultlabel.setFont(normalfont);

		resultpanel.add(resultlabel);
		window.add(resultpanel);

		newgamepanel = new JPanel();
		newgamepanel.setBounds(310, 475, 200, 50);
		newgamepanel.setLayout(new GridLayout(1, 2));
		newgamepanel.setBackground(Color.black);
		newgamebutton = new JButton("New Game");
		newgamebutton.setBackground(Color.black);
		newgamebutton.setForeground(Color.white);
		newgamebutton.setFont(normalfont);
		newgamebutton.addActionListener(choice);
		newgamebutton.setActionCommand("new game");
		newgamepanel.add(newgamebutton);
		
		window.add(newgamepanel);
	}
	
	/**
	 * Displays the hand, the type of hand and the result after comparing both hands
	 */
	public void updateHand() {
		
		fplayerhand = new CreateHand();
		fplayerhandlabel.setText(fplayerhand.getHand());
		fplayerhandtype = fplayerhand.getValue();
		fplayerhandtypelabel.setText(fplayerhand.getHandType(fplayerhandtype));
		
		splayerhand = new CreateHand();
		splayerhandlabel.setText(splayerhand.getHand());
		splayerhandtype = splayerhand.getValue();
		splayerhandtypelabel.setText(splayerhand.getHandType(splayerhandtype));

		if(fplayerhandtype == splayerhandtype) {
			resultlabel.setText("Draw!");
		}else if(fplayerhandtype > splayerhandtype){
			resultlabel.setText("Player 1 Wins!");
		}else {
			resultlabel.setText("Player 2 Wins!");
		}
		
	}
	
}