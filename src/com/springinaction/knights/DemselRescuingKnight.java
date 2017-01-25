package com.springinaction.knights;

public class DemselRescuingKnight implements Knight{
	private RescueDemselQuest quest;
	
	public DemselRescuingKnight(){
		this.quest = new RescueDemselQuest();
	}
	public void embarkOnQuest(){
		quest.embark();
	}
}