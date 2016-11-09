package ma;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	
	@Test
	public void monTest(){
		assertEquals(6, Main.add(2, 4));
	}

}
