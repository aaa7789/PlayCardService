package com.mms.cards.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mms.cards.service.CardsService;

@RestController
public class CardDeckController {
	
	@Autowired
	CardsService cardsService;
	
	
	@RequestMapping(value="/hello" , method=RequestMethod.GET)
	public String hello()
	{
		return "hello";
	}
	
	@RequestMapping(value="/getDeck/{deckName}", method=RequestMethod.GET)
	public String[][] getNamedDeck(@PathVariable(value = "deckName") String deckName)
	{
		return cardsService.getNamedDeck(deckName);
	}
	
	@RequestMapping(value="/getDeck/{deckName}", method=RequestMethod.POST)
	public void addNamedDeck(@PathVariable(value = "deckName") String deckName, @RequestBody String[][] body)
	{
		 cardsService.addDeck(body, deckName);
	}

}
