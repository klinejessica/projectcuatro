package com.revature.factory;

import com.revature.data.Bracket;
import com.revature.data.Round;
import com.revature.prc.match.RPSBracket;
import com.revature.prc.match.RPSRound;

public class RPSFactory {
	
	public Round getRound(){
		return new RPSRound();
	}
	
	public Bracket getBracket(){
		return new RPSBracket();
	}

}
