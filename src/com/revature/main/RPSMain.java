package com.revature.main;

import java.util.ArrayList;

import com.revature.beans.Player;
import com.revature.data.Bracket;
import com.revature.data.Person;
import com.revature.factory.RPSFactory;

public class RPSMain {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();
		
		for(int x = 0; x <51; x++){
			people.add(new Player());
		}
		
		Bracket bracket = new RPSFactory().getBracket();
		bracket.setup(people);
		bracket.play();
		System.out.println(bracket.getWinner());
	}

}
