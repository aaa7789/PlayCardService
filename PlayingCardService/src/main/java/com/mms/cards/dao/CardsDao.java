package com.mms.cards.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CardsDao {
	
	
	String [] clubs = {"clubs-A", "clubs-2", "clubs-3", "clubs-4","clubs-5","clubs-6","clubs-7"
			,"clubs-8","clubs-9","clubs-10","clubs-J","clubs-Q","clubs-K"};
	String [] haarts = {"haarts-A", "haarts-2", "haarts-3", "haarts-4","haarts-5","haarts-6","haarts-7"
			,"haarts-8","haarts-9","haarts-10","haarts-J","haarts-Q","haarts-K"};
	
	String [] diamond = {"diamond-A", "diamond-2", "diamond-3", "diamond-4","diamond-5","diamond-6","diamond-7"
			,"diamond-8","diamond-9","diamond-10","diamond-J","diamond-Q","diamond-K"};
	
	String [] spade = {"spade-A", "spade-2", "spade-3", "spade-4","spade-5","spade-6","spade-7"
			,"spade-8","spade-9","spade-10","spade-J","spade-Q","spade-K"};
	
	String[][] deck1 = {clubs, haarts,diamond, spade};
	
	static	Map<String, String[][]> deckMap = new HashMap<String, String[][]>();
	
	public CardsDao()
	{
		deckMap.put("deck1", deck1);
	}
	
	
	
	
	public String[][] getNamedDeck(String deck)
	{
		return  deckMap.get(deck);
	}




	public void addDeck(String[][] body, String deckName) {
		
		deckMap.put(deckName, body);
	}
	
	
	
	

}
