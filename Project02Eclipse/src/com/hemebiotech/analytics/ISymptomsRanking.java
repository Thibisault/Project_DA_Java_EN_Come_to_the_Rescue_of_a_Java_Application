package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Interface donnant l'accés à la méthode getListe
 */
public interface ISymptomsRanking {

    public ArrayList<String> rankList(ArrayList<String> initialList) throws IOException;
}
