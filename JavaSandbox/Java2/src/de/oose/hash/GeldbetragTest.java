package de.oose.hash;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class GeldbetragTest {

	@Test
	public void testSet() {
		Geldbetrag gb1 = new Geldbetrag(10, "Euro");
		Geldbetrag gb2 = new Geldbetrag(11, "Euro");
		Geldbetrag gb3 = new Geldbetrag(12, "Euro");
		Geldbetrag gb4 = new Geldbetrag(10, "USD");
		
		Set<Geldbetrag> geldSet = new HashSet<Geldbetrag>();
		geldSet.add(gb1);
		geldSet.add(gb1);
		
		geldSet.add(gb2);
		geldSet.add(gb3);
		
		geldSet.add(gb4);
		
		assertTrue(geldSet.contains(gb1));
		assertTrue(geldSet.contains(gb3));
		assertTrue(geldSet.contains(gb4));
		assertEquals(4, geldSet.size());
	}
	
	@Test
	public void testMap(){
		Geldbetrag gb1 = new Geldbetrag(10, "Euro");
		Geldbetrag gb2 = new Geldbetrag(11, "Euro");
		Geldbetrag gb3 = new Geldbetrag(12, "Euro");
		Geldbetrag gb4 = new Geldbetrag(10, "USD");
		
		Map<Geldbetrag, Geldbetrag> geldMap = new HashMap<Geldbetrag, Geldbetrag>();
		geldMap.put(gb1, gb1);
		geldMap.put(gb1, gb1);
		
		geldMap.put(gb2, gb2);
		geldMap.put(gb3, gb3);
		
		geldMap.put(gb4,gb4);
		assertTrue   (geldMap.containsKey(gb1));
		assertSame   (gb1, geldMap.get(gb1));
		assertNotSame(gb1, geldMap.get(gb4));
		assertTrue   (geldMap.containsKey(gb4));
		assertEquals (4, geldMap.size());
	}
	
	@Test
	public void testCompare(){
		Geldbetrag gb1 = new Geldbetrag(10, "Euro");
		Geldbetrag gb2 = new Geldbetrag(11, "Euro");
		Geldbetrag gb3 = new Geldbetrag(12, "Euro");

		Set<Geldbetrag> set = new TreeSet<Geldbetrag>();
		set.add(gb2);
		set.add(gb1);
		set.add(gb3);
		
		for (Geldbetrag geldbetrag : set) {
			System.out.println(geldbetrag);
			
		}
	}
}
