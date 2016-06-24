package algorithms.basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringAndCharTest {
	StringAndChar sac = new StringAndChar();

	@Test
	public void testCheckString() {
		assertEquals("error in upercase String and lowercase char", 3, sac.checkString("ANAKONDA", 'a'));
		assertEquals("error in upercase String and upercase char", 3, sac.checkString("ANAKONDA", 'A'));
		assertEquals("error in lowercase String and lowercase char", 3, sac.checkString("anakonda", 'a'));
		assertEquals("lowercase String and upercase char", 3, sac.checkString("anakonda", 'A'));
		assertEquals("Error in zero matches", 0, sac.checkString("Potato", 'Z'));
		assertEquals("error in String is null", 0, sac.checkString(null, 'A'));
		assertEquals("error in char is 0", 0, sac.checkString("ASDASDASD", '\u0000'));
		assertEquals("error in String is blank", 0, sac.checkString("", 'A'));
		assertEquals("error in multiple matches", 10, sac.checkString("fffffffGHOFFF", 'f'));
	}

}
