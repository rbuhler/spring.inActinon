package com.springinaction.knights.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.springinaction.knights.BraveKnight;
import com.springinaction.knights.Quest;

public class BraveKnightTest {
	@Test
	public void knightShouldEmbarkOnQuest(){
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
		
	}	
}