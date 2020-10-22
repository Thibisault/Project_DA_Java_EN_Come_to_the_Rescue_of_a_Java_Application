package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Interface donnant l'accés à la méthode getListe
 */
public interface ISymptomRanking {

    public TreeMap<String, Integer> rankList(ArrayList<String> initialList) throws IOException;
}
