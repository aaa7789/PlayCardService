package com.mms.cards.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mms.cards.dao.CardsDao;

@Service
public class CardsService {
	
	@Autowired
	CardsDao cardsDao;
	
	public String[][] getNamedDeck(String deck)
	{
		return  cardsDao.getNamedDeck(deck);
	}

	public void addDeck(String[][] body,  String deckName) {
		// TODO Auto-generated method stub
		 cardsDao.addDeck(body, deckName);
	}

}
