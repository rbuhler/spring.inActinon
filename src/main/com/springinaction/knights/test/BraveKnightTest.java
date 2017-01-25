package main.com.springinaction.knights.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import main.com.springinaction.knights.Quest;
import org.junit.Test;

import main.com.springinaction.knights.BraveKnight;

public class BraveKnightTest {
	@Test
	public void knightShouldEmbarkOnQuest(){
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
		
	}	
}