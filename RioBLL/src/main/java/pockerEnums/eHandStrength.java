package pockerEnums;

public enum eHandStrength {
	ROYALFLUSH(100, "IsRoyalFlush"), 
	STRAIGHTFLUSH(90, "IsStraightFlush"),FOUROFAKIND(80,"IsFourOfAKind");
	private int iHandStrength;
	private String strEvalMethod;

	 eHandStrength(int iHandStrength,String strEvalMethod) {
		this.iHandStrength = iHandStrength;
		this.strEvalMethod = strEvalMethod;
		
	}
	
	

}
