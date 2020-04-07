package com.niit.techno.mockitodemo;

import com.niit.techno.mockitodemo.repository.IDatabase;

public class StudentScoreUpdates {
	public IDatabase databaseImpl;
	public StudentScoreUpdates(IDatabase databaseImpl) {
		this.databaseImpl=databaseImpl;
	}
	
	public void calculateSumAndStore(String studentId, int[] scores) {
		int total=0;
		for(int score:scores) {
			total=total+score;
		}
		databaseImpl.updateScores(studentId, total);
	}
}
