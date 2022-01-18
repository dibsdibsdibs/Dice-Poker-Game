package com.dice_poker;

/**
 * Manages the panels and buttons to be displayed
 * @author Divine Grace Lavente
 */
public class DisplayManager {
	
	UserInterface ui;
	public DisplayManager(UserInterface userInterface) {
		ui = userInterface;
	}

	public void showStartUp(){
		ui.titlepanel.setVisible(true);
		ui.startpanel.setVisible(true);
		ui.rankpanel.setVisible(false);
		ui.gamepanel.setVisible(false);
		ui.backpanel.setVisible(false);
		ui.fplayerrollpanel.setVisible(false);
		ui.fplayerpanel.setVisible(false);
		ui.splayerrollpanel.setVisible(false);
		ui.splayerpanel.setVisible(false);
		ui.resultlabel.setVisible(false);
		ui.newgamepanel.setVisible(false);
	}
	
	public void showInstructions() {
		ui.titlepanel.setVisible(false);
		ui.startpanel.setVisible(false);
		ui.rankpanel.setVisible(true);
		ui.gamepanel.setVisible(false);
		ui.backpanel.setVisible(true);
		ui.fplayerrollpanel.setVisible(false);
		ui.fplayerpanel.setVisible(false);
		ui.splayerrollpanel.setVisible(false);
		ui.splayerpanel.setVisible(false);
		ui.resultlabel.setVisible(false);
		ui.newgamepanel.setVisible(false);
	}
	
	public void playGame() {
		ui.updateHand();
		ui.titlepanel.setVisible(false);
		ui.startpanel.setVisible(false);
		ui.rankpanel.setVisible(false);
		ui.gamepanel.setVisible(true);
		ui.backpanel.setVisible(true);
		ui.fplayerrollpanel.setVisible(true);
		ui.fplayerpanel.setVisible(false);
		ui.splayerrollpanel.setVisible(false);
		ui.splayerpanel.setVisible(false);
		ui.resultlabel.setVisible(false);
		ui.newgamepanel.setVisible(false);
	}
	
	public void rollFirstPlayer() {
		ui.titlepanel.setVisible(false);
		ui.startpanel.setVisible(false);
		ui.rankpanel.setVisible(false);
		ui.gamepanel.setVisible(true);
		ui.backpanel.setVisible(false);
		ui.fplayerrollpanel.setVisible(false);
		ui.fplayerpanel.setVisible(true);
		ui.splayerrollpanel.setVisible(true);
		ui.splayerpanel.setVisible(false);
		ui.resultlabel.setVisible(false);
		ui.newgamepanel.setVisible(false);
	}
	
	public void rollSecondPlayer() {
		ui.titlepanel.setVisible(false);
		ui.startpanel.setVisible(false);
		ui.rankpanel.setVisible(false);
		ui.gamepanel.setVisible(true);
		ui.backpanel.setVisible(true);
		ui.fplayerrollpanel.setVisible(false);
		ui.fplayerpanel.setVisible(true);
		ui.splayerrollpanel.setVisible(false);
		ui.splayerpanel.setVisible(true);
		ui.resultlabel.setVisible(true);
		ui.newgamepanel.setVisible(true);
	}
	
}
