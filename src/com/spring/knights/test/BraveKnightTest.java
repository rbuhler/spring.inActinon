package com.spring.knights.test;

import com.spring.knights.BraveKnight;
import com.spring.knights.Quest;
import static org.mokito.Mokito.*;


public class BraveKnightTest {
	@Test
	public void knightShouldEmbarkOnQuest(){
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
		
	}
	
	
}
