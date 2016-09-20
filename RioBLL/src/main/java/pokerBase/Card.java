package pokerBase;

import java.util.Comparator;

public class Card implements Comparable {
	private int iCardNbr;
	private int iCardSuit;
	private int iCardRank;
	public int getiCardNbr() {
		return iCardNbr;
	}
	
	public int getiCardSuit() {
		return iCardSuit;
	}
	
	public int getiCardRank() {
		return iCardRank;
	}

	public Card(int iCardNbr, int iCardSuit, int iCardRank) {
		super();
		this.iCardNbr = iCardNbr;
		this.iCardSuit = iCardSuit;
		this.iCardRank = iCardRank;
	}

	@Override
	public int compareTo(Object o) {
	Card c = (Card) o;
	return c.getiCardRank()-this.iCardRank;
	}
	

	
	
	
}
