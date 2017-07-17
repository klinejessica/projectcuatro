package com.revature.prc.match;

import java.util.ArrayList;
import java.util.List;

import com.revature.data.Bracket;
import com.revature.data.Person;
import com.revature.data.Round;
import com.revature.factory.RPSFactory;

public class RPSBracket implements Bracket {
	ArrayList<Round> currentMatches;
	ArrayList<Person> activePlayers;
	
	Person benched;
	Person winner;
	
	@Override
	public void play() {
		
		while(activePlayers.size() > 1){
			activePlayers = new ArrayList<>();
			for (Round round: currentMatches){
				round.playRound();
				activePlayers.add(round.getWinner());
			}
			setup(activePlayers);
		}
		winner = activePlayers.get(0);
		
	}

	@Override
	public Person getWinner() {
		return winner;
	}

	@Override
	public void setup(List<Person> players) {
		RPSFactory factory = new RPSFactory();
		activePlayers = (ArrayList<Person>) players;
		currentMatches = new ArrayList<>();
		for (Person person: players){
			if (benched == null){
				benched = person;
			}
			else{
				Round first = factory.getRound();
				first.setup(benched, person);
				currentMatches.add(first);
				benched = null;
			}
		}
	}

}
