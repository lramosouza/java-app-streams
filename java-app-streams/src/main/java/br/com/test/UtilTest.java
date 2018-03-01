package br.com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.streams.StreamImpl;
import br.com.streams.Util;

public class UtilTest {

	@Test
	public void testFindFirstChar() throws Exception {
		
		StreamImpl stream = new StreamImpl("xxaabsscdeqqe");
        assertEquals("b", Util.findFirstChar(stream).toString());                		

	}
	
	@Test
	public void testFindFirstCharTestCase2() throws Exception {
		
		StreamImpl stream = new StreamImpl("aeiou");
        assertEquals("a", Util.findFirstChar(stream).toString());                		

	}
	
	@Test
	public void testFindFirstCharTestCase3() throws Exception {
		
		StreamImpl stream = new StreamImpl("batman");
        assertEquals("b", Util.findFirstChar(stream).toString());                		

	}


}
