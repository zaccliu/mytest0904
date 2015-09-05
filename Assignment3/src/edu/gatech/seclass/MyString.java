package edu.gatech.seclass;

public class MyString implements MyStringInterface{
	

	private String zystring;
	
	@Override
	public void setString(String string) {
		zystring = new String(string);
		
	}
	
	@Override
	public String getString() {
		return zystring;
	}
	
	
	@Override
	public String getConsonants() {
		String CONSONANTS = "bcdfghjklmnpqrstvwxyz" + "BCDFGHJKLMNPQRSTVWXYZ";
		String newString="";
		
		for (int i=0; i<zystring.length(); i++) {
			if (CONSONANTS.indexOf(zystring.charAt(i)) != -1) {
				newString = newString + zystring.charAt(i);
		}
		}
		return newString;
	}
	
	@Override
	public int numberOfConsonants() {
	
		String CONSONANTS = "bcdfghjklmnpqrstvwxyz" + "BCDFGHJKLMNPQRSTVWXYZ";
		int consonants = 0;
		
		//for each character in my string
		for (int i=0; i<zystring.length(); i++) {
			if (CONSONANTS.indexOf(zystring.charAt(i)) != -1) {
			consonants++;
			}
		}	
		return consonants;
	}
	
	@Override
	public char getCharacter(int position)
			throws IllegalArgumentException, IllegalIndexException {
		
		if (position <=0 )
		{
			throw new IllegalArgumentException();
		} 
		
		if (position > zystring.length()){
			throw new IllegalIndexException();
		}
		
		return zystring.charAt(position-1);
	}
		
	@Override
	public void flipCaseInSubstring(int startPosition, int endPosition)
			throws IllegalArgumentException, IllegalIndexException {
		
		if (startPosition <=0 || endPosition <=0 || startPosition > endPosition)
		{
			throw new IllegalArgumentException();
		} 
		
		if (endPosition > zystring.length()){
			throw new IllegalIndexException();
		}
		
		StringBuilder temp = new StringBuilder(zystring);
		for (int x = startPosition-1; x < endPosition; x++)
        {   //System.out.println(x);
        	//System.out.println(zystring);
        	//System.out.println(zystring.length());
        	//System.out.println("*******************");
        	//System.out.println(zystring.charAt(1));
        	//System.out.println(zystring.charAt(x));
            char c = zystring.charAt(x);
            //System.out.println(c);
            boolean check = Character.isUpperCase(c);
            if (check == true)
            	temp.setCharAt(x,Character.toLowerCase(c));
            else
            	temp.setCharAt(x, Character.toUpperCase(c));
        }		
		zystring = temp.toString();
	}
}
