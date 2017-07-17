package com.revature.prc.match;

import com.revature.data.Person;
import com.revature.data.Round;

public class RPSRound implements Round{
	
	
	
	Person red, blue, winner = null;
	 
	@Override
	public void playRound() {
		while (winner == null){
		Result redResult = Result.forInt(red.getChoice(3));
		Result blueResult = Result.forInt(blue.getChoice(3));
		
		winner = determineWinner(redResult, blueResult);
		}
	}
	private Person determineWinner(Result redResult, Result blueResult){
		if (redResult == blueResult ){
			return null;
		}
		if (redResult == Result.Rock && blueResult == Result.Scissors){
			return red;
		}
		if (redResult == Result.Paper && blueResult == Result.Rock){
			return red;
		}
		if (redResult == Result.Scissors && blueResult == Result.Paper){
			return red;
		}
		return blue;
	}

	@Override
	public Person getWinner() {
		// TODO Auto-generated method stub
		return winner;
	}

	@Override
	public void setup(Person red, Person blue) {
	
		
	}

}
