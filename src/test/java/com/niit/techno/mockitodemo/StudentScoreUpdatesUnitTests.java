package com.niit.techno.mockitodemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.niit.techno.mockitodemo.repository.IDatabase;

@RunWith(MockitoJUnitRunner.class)
public class StudentScoreUpdatesUnitTests {
	
	@InjectMocks
	public StudentScoreUpdates studentScores;
	
	@Mock
	public IDatabase mockDatabase;
	
	@Test
	public void calculteSumAndStore_withValidInput_shouldCalculateAndUpdateResultInDb() {
		studentScores = new StudentScoreUpdates(mockDatabase);
		int[] scores = {60,40,50};
		
		studentScores.calculateSumAndStore("student1", scores);
		
		Mockito.verify(mockDatabase,Mockito.times(1)).updateScores("student1",150 );
		
	}
}
