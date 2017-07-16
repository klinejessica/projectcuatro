package com.revature.factory;

import com.revature.data.Bracket;
import com.revature.data.Round;
import com.revature.ttt.match.TTTBracket;
import com.revature.ttt.match.TTTRound;

public class TTTFactory {
	
	public Round getRound(){
		return new TTTRound();
	}
	public Bracket getBracket(){
		return new TTTBracket();
	}

}
