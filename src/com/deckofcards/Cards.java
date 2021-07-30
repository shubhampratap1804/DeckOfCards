package com.deckofcards;

public class Cards {

	// Creating instance variable for the game
	private String suit;
	private String rank;
	private int value;

	// Generated constructors for the attributes
	public Cards(String suit, String rank, int value) {
		this.suit = suit;
		this.rank = rank;
		this.value = value;
	}

	@Override
	public String toString() {
		return rank + " of " + suit;
	}

	// Generated getters to access attributes outside the class

	public String getSuit() {
		return suit;
	}

	public String getRank() {
		return rank;
	}

	public int getValue() {
		return value;
	}

	// Main method
	public static void main(String[] args) {
		System.out.println("Welcome to the deck of cards!");
		Cards[] deck = new Cards[52];
	}
}
