package com.dice_poker;

import java.util.Arrays;

/**
 * Creates the hand
 * @author Divine Grace Lavente
 */
public class CreateHand {
	RollDie roll;
	int[] hand = new int[5];
	String stringhand = "";
	String handtype;
	int value = 0;
	int[] handcombination = {0, 0, 0, 0, 0, 0};
	
	//Creates a hand by rolling the die five times and stores it an array
	public CreateHand() {
		for(int i = 0; i < 5; i++) {
			roll = new RollDie();
			hand[i] = roll.getRolledValue();
			stringhand += hand[i] + "    ";
		}
	}
	
	/**
	 * Checks the hand type
	 * @param hand An array of rolled die values
	 * @return An integer representation of the hand type
	 */
	public int checkHandType(int[] hand) {
		
		//Sorts the array first for easier checking
		Arrays.sort(hand);
		int temphand = 0;
		
		for(int i = 0; i < 5; i++) {
			//Counts occurrence of number
			switch(hand[i]) {
			case 1: handcombination[0] += 1; break;
			case 2: handcombination[1] += 1; break;
			case 3: handcombination[2] += 1; break;
			case 4: handcombination[3] += 1; break;
			case 5: handcombination[4] += 1; break;
			case 6: handcombination[5] += 1; break;
			default: break;
			}
		}
		
		//Checks which hand type corresponds to the hand combination
		for(int j = 0; j < 6; j++) {
			switch(handcombination[j]) {
			case 2: temphand += 1; break;
			case 3: temphand += 4; break;
			case 4: temphand += 6; break;
			case 5: temphand += 7; break;
			default: break;
			}
		}
		
		boolean straight = true;
		
		//Checks if a hand has a straight combination
		for(int k = 0; k < 4; k++) {
			if(hand[k] + 1 != hand[k + 1]) {
				straight = false;
				break;
			}
		}

		if(straight == true) {
			temphand = 3;
		}
		
		return temphand;
	}
	
	/**
	 * Returns the string equivalent of the hand type
	 * @param value An integer representation of the hand type
	 * @return A string representation of the hand type
	 */
	public String getHandType(int value) {
		
		switch(value) {
		case 1: handtype = "One Pair"; break;
		case 2: handtype = "Two Pairs"; break;
		case 3: handtype = "Straight"; break;
		case 4: handtype = "Three of a Kind"; break;
		case 5: handtype = "Full House"; break;
		case 6: handtype = "Four of a Kind"; break;
		case 7: handtype = "Five of a Kind"; break;
		default: handtype = "Nothing :("; break;
		}
		
		return handtype;
	}
	
	/**
	 * Returns the string version of hand
	 * @return A string representation of the hand
	 */
	public String getHand() {
		return stringhand;
	}
	
	/**
	 * Returns the hierarchy value of the hand
	 * @return An integer representation of the hand type
	 */
	public int getValue() {
		value = checkHandType(hand);
		return value;
	}
}
