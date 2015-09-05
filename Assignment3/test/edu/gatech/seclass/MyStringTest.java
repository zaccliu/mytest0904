package edu.gatech.seclass;

import static org.junit.Assert.*;




import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.gatech.seclass.MyString;


public class MyStringTest {

	private MyStringInterface mystring;

	@Before
	public void setUp() throws Exception {
		mystring = new MyString();
	}

	@After
	public void tearDown() throws Exception {
		mystring = null;
	}

	@Test
	public void testGetConsonants1() {
		mystring.setString("I like vowels better than consonants");
		assertEquals("lkvwlsbttrthncnsnnts", mystring.getConsonants());
	}

	@Test
	public void testGetConsonants2() {
		mystring.setString("Test This String");
		assertEquals("TstThsStrng", mystring.getConsonants());
	}

	@Test
	public void testGetConsonants3() {
		mystring.setString("");
		assertEquals("", mystring.getConsonants());
	}

	@Test
	public void testGetConsonants4() {
		mystring.setString("aeiouAEIOU");
		assertEquals("", mystring.getConsonants());
	}

	@Test
	public void testNumberOfConsonants1() {
		mystring.setString("I like vowels better than consonants");
		assertEquals(20, mystring.numberOfConsonants());
	}

	@Test
	public void testNumberOfConsonants2() {
		mystring.setString("test this string");
		assertEquals(11, mystring.numberOfConsonants());
	}

	@Test
	public void testNumberOfConsonants3() {
		mystring.setString("");
		assertEquals(0, mystring.numberOfConsonants());
	}

	@Test
	public void testNumberOfConsonants4() {
		mystring.setString("aeiouAEIOU");
		assertEquals(0, mystring.numberOfConsonants());
	}

		
	@Test(expected = IllegalArgumentException.class)
	public void testGetCharacter1() throws IllegalArgumentException, IllegalIndexException {
		mystring.setString("test this string");
		mystring.getCharacter(0);
	}

	@Test
	public void testGetCharacter2() {
		mystring.setString("I like vowels better than consonants");
		assertEquals('e', mystring.getCharacter(16));
	}

	@Test(expected = IllegalIndexException.class)
	public void testGetCharacter3() throws IllegalArgumentException, IllegalIndexException {
		mystring.setString("test this string");
		mystring.getCharacter(20);
	}
	

	@Test
	public void testGetCharacter4() {
		mystring.setString("This is the last test case");
		assertEquals(' ', mystring.getCharacter(5));
	}

	@Test
	public void testFlipCaseInSubstring1() {
		mystring.setString("I Like Vowels Better Than Consonants");
		mystring.flipCaseInSubstring(7, 21);
		System.out.println(mystring.getString());
		assertEquals("I Like vOWELS bETTER Than Consonants", mystring.getString());	
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFlipCaseInSubstring2() throws IllegalArgumentException, IllegalIndexException
	{
		mystring.setString("This is the last test case");
		mystring.flipCaseInSubstring(5, 3);
	}   
	
	@Test(expected = IllegalIndexException.class)
	public void testFlipCaseInSubstring3() throws IllegalArgumentException, IllegalIndexException
	{
		mystring.setString("This is the last test case");
		mystring.flipCaseInSubstring(3, 30);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testFlipCaseInSubstring4() throws IllegalArgumentException, IllegalIndexException
	{
		mystring.setString("This is the last test case");
		mystring.flipCaseInSubstring(-1, 3);
	} 	

}
