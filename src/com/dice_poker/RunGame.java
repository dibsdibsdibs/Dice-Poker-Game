package com.dice_poker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Runs the game
 * @author Divine Grace Lavente
 *
 */
public class RunGame {

	UserInterface ui = new UserInterface();
	DisplayManager dm = new DisplayManager(ui);
	ChoiceHandler ch = new ChoiceHandler();
	
	/**
	 * Entry point of the program
	 * @param args
	 */
	public static void main(String[] args) {
		new RunGame();
	}

	public RunGame() {
		ui.createUI(ch);
		dm.showStartUp();
	}
	
	/**
	 * Takes player's choices and implements action
	 * @author Divine Grace Lavente
	 */
	public class ChoiceHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			String playerchoice = event.getActionCommand();
			
			switch(playerchoice) {
			case "start": dm.playGame(); break;
			case "rank": dm.showInstructions(); break;
			case "back": dm.showStartUp(); break;
			case "player1": dm.rollFirstPlayer(); break;
			case "player2": dm.rollSecondPlayer(); break;
			case "new game": dm.playGame(); break;
			}
		}
	}
}
