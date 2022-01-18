package com.dice_poker;

/**
 * Rolls the die
 * @author Divine Grace Lavente
 */
public class RollDie {
	int rolledvalue;
	
	/**
	 * Rolls the die
	 */
	public RollDie() {
		rollDie();
	}
	
	/**
	 * Returns the rolled value
	 * @return An integer representation of the generated number
	 */
	public int getRolledValue() {
		return rolledvalue;
	}
	
	/**
	 * Generates a random number from 1 - 6
	 * @return An integer representation of the generated number
	 */
	public void rollDie() {
		rolledvalue = (int) (Math.random()*6) + 1;
	}
}
