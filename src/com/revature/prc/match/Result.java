package com.revature.prc.match;


public enum Result{

	Rock(0), Paper(1), Scissors(2);
	
	public final int fId;
	
	private Result(int id){
		this.fId = id;
	}
	
	public static Result forInt(int id){
		for (Result result : values()){
			if (result.fId == id){
				return result;
			}
		}
		throw new IllegalArgumentException("Invalid Result id: " + id);
	}
}
