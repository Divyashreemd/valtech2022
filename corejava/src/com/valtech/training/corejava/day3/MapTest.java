package com.valtech.training.corejava.day3;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

import com.valtech.training.corejava.day1.Point;

public class MapTest {

	@Test
	public void testHashMap() {
		//Map<String,Point> points = new HashMap<>();
		Map<String,Point> points = new TreeMap<>();
		points.put("1,1", new Point(1,1));
		points.put("1,2", new Point(1,1));
		points.put("2,2", new Point(2,2));
		points.put("1,2", new Point(1,1));
		assertEquals(3,points.size());
		Set<String> Keys =points.keySet();
		for (Iterator iterator = Keys.iterator(); iterator.hasNext();) {
			String keys = (String) iterator.next();
			System.out.println("Key="+keys+"Value "+points.get(keys));
			
		}
		
	}

}
