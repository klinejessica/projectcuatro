package com.revature.data;

public interface Round {
	public void playRound();
	public Person getWinner();
	public void setup(Person red, Person blue);
}
