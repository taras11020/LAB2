package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

import pockerEnums.eCardNo;

public class Hand {
	private UUID HandID;
	private ArrayList<Card> CardsinHand  = new ArrayList<Card> ();
	private boolean bScored;

	public void evaluateHand() {
		
		Collections.sort(CardsinHand);
	}
	

	private static HandScore IsFourOfAKind(ArrayList<Card> handcards) {
		HandScore hs;
		if (handcards.get(0).getiCardRank() == handcards.get(3).getiCardRank()) {
			ArrayList<Card> Kickers = new ArrayList<Card>();
			Kickers.add(handcards.get(eCardNo.FIFTHCARD));
			hs = new HandScore(8, handcards.get(0).getiCardRank(), 0, Kickers);

		}

		else if (handcards.get(1).getiCardRank() == handcards.get(4).getiCardRank()) {
			ArrayList<Card> Kickers = new ArrayList<Card>();
			Kickers.add(handcards.get(0));
			hs = new HandScore(8, handcards.get(1).getiCardRank(), 0, Kickers);

		}
		return hs;
	}

}
