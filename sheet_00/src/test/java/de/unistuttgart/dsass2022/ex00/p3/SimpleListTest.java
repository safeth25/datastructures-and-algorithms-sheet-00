package de.unistuttgart.dsass2022.ex00.p3;

import static org.junit.Assert.*;


import java.util.Iterator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;

import de.unistuttgart.dsass2022.ex00.p3.ISimpleListIterable;
import de.unistuttgart.dsass2022.ex00.p3.SimpleList;

public class SimpleListTest {
	
	
	
	@Test
	public void testIterator() {
		SimpleList<Integer> list = new SimpleList<Integer>();
		
		for(int i = 1; i < 3; i++) {
			list.append(i);
		}
		
		Iterator<Integer> listIterator = list.iterator();
		
		assertEquals(new Integer(1) ,listIterator.next()); 
		
		
	}
	@Test void testSkippingIterator() {
		SimpleList<Integer> skippingList = new SimpleList<Integer>();
		for(int i = 1; i <= 12; i++) {
			skippingList.append(i);
		}
		
		Iterator<Integer> listSkippingIterator = skippingList.skippingIterator(3);
		assertEquals(new Integer(1) ,listSkippingIterator.next()); 
	
	}
}
