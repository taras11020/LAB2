package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

public class Deck  {
	private ArrayList<Card> DeckCards;
	public Deck()
	{
		
		DeckCards = new ArrayList<Card>();
		Card c = new Card(1,2,3);
		DeckCards.add(c);
	}
		


}
