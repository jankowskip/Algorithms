package algorithms.basic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringAndCharTest {
StringAndChar sac = new StringAndChar();
	

	@Test
	public void testCheckString() {
		int result = sac.checkString("ANAKONDA", 'a');
		assertEquals("error in upercase String and lowercase char", result, 3);
		result = sac.checkString("ANAKONDA", 'A');
		assertEquals("error in upercase String and upercase char", result, 3);
		result = sac.checkString("anakonda", 'a');
		assertEquals("error in lowercase String and lowercase char", result, 3);
		result = sac.checkString("anakonda", 'A');
		assertEquals("lowercase String and upercase char", result, 3);
		result = sac.checkString("Potato", 'Z');
		assertEquals("Error in zero matches", result, 0);
		result = sac.checkString(null, 'A');
		assertEquals("error in String is null", result, 0);
		result = sac.checkString("ASDASDASD", '\u0000');
		assertEquals("error in char is 0", result, 0);
		result = sac.checkString("", 'A');
		assertEquals("error in String is blank", result, 0);
		result = sac.checkString("fffffffGHOFFF", 'f');
		assertEquals("error in multiple matches", result, 10);
	}

}
