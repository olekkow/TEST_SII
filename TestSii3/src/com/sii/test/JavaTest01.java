package com.sii.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> mapa = new HashMap<String,Integer>();
		mapa.put("jeden", 1);
		mapa.put("dwa", 2);
		mapa.put("trzy", 3);
		
		Iterator<String> it = mapa.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = mapa.get(key);
			System.out.printf( " %s => %d \n", key, value );
		}

		 it = mapa.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = mapa.get(key);
			System.out.printf( " %s => %d \n", key, value );
		}

	}

}
