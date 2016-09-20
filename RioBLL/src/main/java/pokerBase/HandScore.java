package pokerBase;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;

import pockerEnums.eHandStrength;

public class HandScore {

	private eHandStrength HandStrength;
	private int HiHand;
	private int LoHand;
	private ArrayList<Card> Kickers;

	public HandScore(eHandStrength handStrength, int hiHand, int loHand, ArrayList<Card> Kickers) {
		super();

		HandStrength = handStrength;
		HiHand = hiHand;
		LoHand = loHand;
		Kickers = Kickers;
	}

	public eHandStrength getHandStrength() {
		return HandStrength;
	}

	public int getHiHand() {
		return HiHand;
	}

	public void setHiHand(int hiHand) {
		HiHand = hiHand;
	}

	public int getLoHand() {
		return LoHand;
	}

	public void setLoHand(int loHand) {
		LoHand = loHand;
	}

	public ArrayList<Card> getKickers() {
		return Kickers;
	}

}
