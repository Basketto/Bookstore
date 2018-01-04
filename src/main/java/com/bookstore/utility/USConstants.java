package com.bookstore.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class USConstants {
	
	public final static String US = "US";
	
	public final static Map<String, String> mapOfUSStates = new HashMap<String, String>() {
		{
			put("dolnośląskie", "dolnośląskie");
			put("kujawsko-pomorskie", "kujawsko-pomorskie");
			put("lubelskie", "lubelskie");
            put("	lubuskie", " lubuskie");
            put("łódzkie", "	łódzkie");
            put("małopolskie", "małopolskie");
            put("	mazowieckie", "	mazowieckie");
            put("opolskie", "opolskie");
            put("	podkarpackie", "	podkarpackie");
            put("	podlaskie", "	podlaskie");
            put("	pomorskie", "pomorskie");
            put("śląskie	", "śląskie");
            put("	świętokrzyskie", "świętokrzyskie");
            put("warmińsko-mazurskie", "warmińsko-mazurskie");
            put("	wielkopolskie", "wielkopolskie");
            put("	zachodniopomorskie", "zachodniopomorskie");
           
		}
	};
	
	public final static List<String> listOfUSStatesCode = new ArrayList<>(mapOfUSStates.keySet());
	public final static List<String> listOfUSStatesName = new ArrayList<>(mapOfUSStates.values());

}
