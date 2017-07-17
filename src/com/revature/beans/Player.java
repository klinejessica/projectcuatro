package com.revature.beans;

import com.revature.data.Person;

public class Player extends PersonImpl{
	
	public int getChoice(int numOfChoices){
		return (int)(Math.random()*numOfChoices);
	}
}

