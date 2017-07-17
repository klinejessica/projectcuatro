package com.revature.data;

import java.util.List;

public interface Bracket {
	
	public void play();
	public Person getWinner();
	public void setup(List<Person> players);
	
}
