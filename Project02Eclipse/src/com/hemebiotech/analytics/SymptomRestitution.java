package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

public class SymptomRestitution implements ISymptomRestitution {


public ArrayList<String> getListFinal(TreeMap<String, Integer> symptoms) {

    ArrayList<String> list = new ArrayList<>();

    for (String cle : symptoms.keySet()) {
        list.add(cle + "=" + symptoms.get(cle));
        System.out.println(cle + "=" + symptoms.get(cle));
    }

    return list;
   }
}