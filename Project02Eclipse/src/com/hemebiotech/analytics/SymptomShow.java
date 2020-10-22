package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

public class SymptomShow implements IShowClass {


public ArrayList<String> showlist(TreeMap<String, Integer> symptoms) {

    ArrayList<String> list = new ArrayList<>();

    for (String cle : symptoms.keySet()) {
        list.add(cle + "=" + symptoms.get(cle));
    }
    return list;
   }
}